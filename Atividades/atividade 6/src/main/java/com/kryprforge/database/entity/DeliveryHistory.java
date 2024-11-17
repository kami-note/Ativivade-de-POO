package com.kryprforge.database.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "delivery_history")
public class DeliveryHistory extends EntityBase {

    @ManyToOne
    @JoinColumn(name = "delivery_status_id", referencedColumnName = "id", nullable = false)
    private DeliveryStatus deliveryStatus;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false)
    private CustomerOrder order;

    @Column(name = "date", nullable = false)
    private Date date;

    public DeliveryHistory() {}

    public DeliveryHistory(DeliveryStatus deliveryStatus, CustomerOrder order, Date date) {
        this.deliveryStatus = deliveryStatus;
        this.order = order;
        this.date = date;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
