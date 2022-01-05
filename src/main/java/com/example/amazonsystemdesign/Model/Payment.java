package com.example.amazonsystemdesign.Model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class Payment {
    @Id
    @Column(name = "payment_id", nullable = false, updatable = false)
    @GeneratedValue(generator = "UUID", strategy = GenerationType.AUTO)
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;

    private PaymentMethod paymentMethod;

    public enum PaymentMethod {
        CASH, DEBIT_CARD, CREDIT_CARD, NETBANKING, UPI
    }

    @NonNull
    private String orderId;

    @NonNull
    private String customerId;

    @CreationTimestamp
    private Timestamp createdAt;
}
