package com.anukriti.coffee_machine.model;

import com.anukriti.coffee_machine.enums.OrderStatus;

public class Order {
    private String id;
    private Beverage beverage;
    private Double price;
    private Payment payment;
    private OrderStatus orderStatus;
    public Order(String id, Beverage beverage, Double price, Payment payment){
        this.id = id;
        this.beverage = beverage;
        this.price = price;
        this.payment = payment;
        this.orderStatus = OrderStatus.PENDING;
    }

    public void updateOrderStatus(OrderStatus status){
        this.orderStatus = status;
    }

    public String getId() {
        return id;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public Double getPrice() {
        return price;
    }

    public Payment getPayment() {
        return payment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
