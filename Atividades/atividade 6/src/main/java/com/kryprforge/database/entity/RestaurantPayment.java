package com.kryprforge.database.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurant_payment")
public class RestaurantPayment extends EntityBase {

    @ManyToOne
    @JoinColumn(name = "restaurant_id", referencedColumnName = "id", nullable = false)
    private Restaurant restaurant;

    @ManyToOne
    @JoinColumn(name = "payment_method_id", referencedColumnName = "id", nullable = false)
    private PaymentMethod paymentMethod;

    public RestaurantPayment() {}

    public RestaurantPayment(Restaurant restaurant, PaymentMethod paymentMethod) {
        this.restaurant = restaurant;
        this.paymentMethod = paymentMethod;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
