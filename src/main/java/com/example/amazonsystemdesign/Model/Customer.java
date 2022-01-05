package com.example.amazonsystemdesign.Model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;
import java.util.Date;


@Entity
@Getter
@Setter
public class Customer {
    @Id
    @Column(name = "customer_id", nullable = false, updatable = false)
    @GeneratedValue(generator = "UUID", strategy = GenerationType.AUTO)
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String customerID;

    @NonNull
    private String name;

    @NonNull
    private Long mobile;

    @NotBlank(message = "Email is mandatory")
    @NonNull
    private String email;

    @OneToOne
    private Address address;

    @CreationTimestamp
    private Timestamp createdAt;

}
