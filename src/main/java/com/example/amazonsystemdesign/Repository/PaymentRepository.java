package com.example.amazonsystemdesign.Repository;

import com.example.amazonsystemdesign.Model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, String> {
}