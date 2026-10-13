package com.anukriti.coffee_machine.service;

import com.anukriti.coffee_machine.enums.Ingredient;
import com.anukriti.coffee_machine.enums.OrderStatus;
import com.anukriti.coffee_machine.enums.PaymentStatus;
import com.anukriti.coffee_machine.inventory.Inventory;
import com.anukriti.coffee_machine.model.Beverage;
import com.anukriti.coffee_machine.model.Order;
import com.anukriti.coffee_machine.model.Payment;

import java.util.Map;
import java.util.UUID;

public class CoffeeMachine {
    private Inventory inventory;

    public CoffeeMachine(Inventory inventory){
        this.inventory = inventory;
    }

    public Order processOrder(Beverage beverage, PaymentStatus paymentStatus){
        Order order = recieveOrder(beverage);

        // 1. Check ingredient availability before accepting payment.
        Map<Ingredient, Double> recipe = beverage.getIngredientList();

        if(!checkIngredients(recipe)){
            order.updateOrderStatus(OrderStatus.FAILED);
            return order;
        }

        // 2. Process the payment outcome.
        order.getPayment().setStatus(paymentStatus);

        if(paymentStatus != PaymentStatus.SUCCESS){
            order.updateOrderStatus(OrderStatus.FAILED);
            return order;
        }

        order.updateOrderStatus(OrderStatus.PAID);

        // 3. Deduct ingredients.
        if(!deductIngredients(recipe)){
            order.updateOrderStatus(OrderStatus.FAILED);
            return order;
        }

        // 4. Prepare the beverage.
        order.updateOrderStatus(OrderStatus.PREPARING);
        beverage.prepare();

        // 5. Complete the order.
        updateOrderStatus(order, OrderStatus.COMPLETED);

        return order;
    }

    private Order recieveOrder(Beverage beverage){
        String orderId = UUID.randomUUID().toString();
        Payment payment = new Payment(UUID.randomUUID().toString(), orderId, beverage.getPrice());

        Order order = new Order(orderId, beverage, beverage.getPrice(), payment);
        return order;
    }

    private boolean checkIngredients(Map<Ingredient, Double> recipe){
        for(Ingredient rec: recipe.keySet()){
            if(!inventory.checkIngredient(rec, recipe.get(rec))) return false;
        }
        return true;
    }

    private boolean deductIngredients(Map<Ingredient, Double> recipe){
        for(Ingredient rec: recipe.keySet()){
            if(!inventory.removeStock(rec, recipe.get(rec))) return false;
        }
        return true;
    }

    private void updateOrderStatus(Order order, OrderStatus status){
        order.updateOrderStatus(status);
    }
}
