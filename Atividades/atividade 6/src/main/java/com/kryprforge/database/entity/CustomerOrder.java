package com.kryprforge.database.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_order")
public class CustomerOrder extends OrderBase {

    @Column(name = "delivery_fee")
    private double deliveryFee;

    @Column(name = "change_amount")
    private double changeAmount;

    @Column(name = "notes")
    private String notes;

    public CustomerOrder() {}

    public CustomerOrder(double deliveryFee, double changeAmount, String notes) {
        this.deliveryFee = deliveryFee;
        this.changeAmount = changeAmount;
        this.notes = notes;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }
}
