package com.example.amazonsystemdesign.Model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class OrderRequest {
    @Id
    @Column(name = "order_id", nullable = false, updatable = false)
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
