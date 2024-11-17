package com.kryprforge.database.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "delivery_status")
public class DeliveryStatus extends EntityBase {

    @Column(name = "status_name", nullable = false)
    private String statusName;

    public DeliveryStatus() {}

    public DeliveryStatus(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
