package com.example.amazonsystemdesign.Model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(generator = "UUID", strategy = GenerationType.AUTO)
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;

    @NonNull
    private String name;

    @NonNull
    private ItemGenre genre;

    @NonNull
    private Long price;

    @NonNull
    private Integer countOfItemInStock;

    @CreationTimestamp
    private Timestamp createdAt;

    @OneToMany
    private Set<Seller> sellerId;
}

