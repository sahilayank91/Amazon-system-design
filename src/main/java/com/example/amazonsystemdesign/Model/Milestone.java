package com.example.amazonsystemdesign.Model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
public class Milestone {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(generator = "UUID", strategy = GenerationType.AUTO)
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;
    private String updateText;
    private OrderMovementStatus orderMovementStatus;
    @CreationTimestamp
    private Timestamp createdAt;
    public enum OrderMovementStatus {
        COMPLETED, INPROCESS
    }
}
