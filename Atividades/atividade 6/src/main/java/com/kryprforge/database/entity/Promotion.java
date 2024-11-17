package com.kryprforge.database.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "promotion")
public class Promotion extends EntityBase {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "discount_value", nullable = false)
    private double discountValue;

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @Column(name = "validity", nullable = false)
    private String validity;

    public Promotion() {}

    public Promotion(String name, double discountValue, String code, String validity) {
        this.name = name;
        this.discountValue = discountValue;
        this.code = code;
        this.validity = validity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(double discountValue) {
        this.discountValue = discountValue;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }
}
