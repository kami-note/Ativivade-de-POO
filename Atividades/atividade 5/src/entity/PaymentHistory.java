package src.entity;

import java.util.Date;

public class PaymentHistory extends EntityBase {
    private Date paymentDate;
    private PaymentMethod paymentMethod;
    private double amount;
}
