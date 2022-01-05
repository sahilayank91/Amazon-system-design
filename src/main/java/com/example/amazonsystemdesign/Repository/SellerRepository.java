package com.example.amazonsystemdesign.Repository;

import com.example.amazonsystemdesign.Model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SellerRepository extends CrudRepository<Seller, String> {
}