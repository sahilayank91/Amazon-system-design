package com.example.amazonsystemdesign.Services;

import com.example.amazonsystemdesign.Model.Payment;
import com.example.amazonsystemdesign.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    @Async
    public CompletableFuture<Boolean> makePayment(Payment payment){
        Payment payment1 = paymentRepository.save(payment);
        return CompletableFuture.completedFuture(payment1.getId() != null);
    }
}
