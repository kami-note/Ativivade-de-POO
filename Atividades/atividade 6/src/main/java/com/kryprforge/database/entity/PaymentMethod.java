package com.kryprforge.database.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "payment_method")
public class PaymentMethod extends EntityBase {

    @Column(name = "payment_type", nullable = false)
    private String paymentType;

    public PaymentMethod() {}

    public PaymentMethod(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
