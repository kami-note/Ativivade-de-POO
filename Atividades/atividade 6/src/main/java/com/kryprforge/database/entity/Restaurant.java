package com.kryprforge.database.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurant")
public class Restaurant extends EntityBase {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false)
    private Category category;

    @Column(name = "has_pickup_option", nullable = false)
    private boolean hasPickupOption;

    public Restaurant() {}

    public Restaurant(String name, String phoneNumber, Category category, boolean hasPickupOption) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.category = category;
        this.hasPickupOption = hasPickupOption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isHasPickupOption() {
        return hasPickupOption;
    }

    public void setHasPickupOption(boolean hasPickupOption) {
        this.hasPickupOption = hasPickupOption;
    }
}
