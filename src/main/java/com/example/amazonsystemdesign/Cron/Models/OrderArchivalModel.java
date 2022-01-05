package com.example.amazonsystemdesign.Cron.Models;

import com.example.amazonsystemdesign.Model.OrderStatus;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.sql.Timestamp;

@Document(indexName = "order")
@Getter
@Setter
public class OrderArchivalModel {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(generator = "UUID", strategy = GenerationType.AUTO)
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;

    @NonNull
    private String itemId;

    @NonNull
    private String customerId;

    @NonNull
    private String sellerId;

    @NonNull
    private OrderStatus status;

    @CreationTimestamp
    private Timestamp createdAt;
}
