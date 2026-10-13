package com.anukriti.coffee_machine.model;

import com.anukriti.coffee_machine.enums.PaymentStatus;

public class Payment {
    private String id;
    private String orderId;
    private Double amount;
    private PaymentStatus status;

    public Payment(String id, String orderId, Double amount){
        this.id = id;
        this.orderId = orderId;
        this.amount = amount;
        this.status = PaymentStatus.INITIATED;
    }
    public String getId() {
        return id;
    }

    public String getOrderId() {
        return orderId;
    }

    public Double getAmount() {
        return amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
