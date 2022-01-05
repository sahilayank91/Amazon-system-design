package com.example.amazonsystemdesign.Services;

import com.example.amazonsystemdesign.Model.Payment;
import com.example.amazonsystemdesign.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public Boolean makePayment(Payment payment){
        Payment payment1 = paymentRepository.save(payment);
        return payment1.getId() != null;
    }
}
