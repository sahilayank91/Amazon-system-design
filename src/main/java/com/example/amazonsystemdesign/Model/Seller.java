package com.example.amazonsystemdesign.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity
@Getter
@Setter
public class Seller {
    @Id
    @Column(name = "seller_id", nullable = false, updatable = false)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @NonNull
    private String sellerID;

    @NonNull
    private String name;

    @NonNull
    @Column(nullable = false)
    private String email;

    @NonNull
    @Pattern(regexp="(^$|[0-9]{10})", message = "Mobile no should be minimum of 10 digits")
    private String mobile;

    @OneToOne
    private Address address;

}
