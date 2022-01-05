package com.example.amazonsystemdesign.Controller;

import com.example.amazonsystemdesign.Model.OrderStatus;
import com.example.amazonsystemdesign.Model.Payment;
import com.example.amazonsystemdesign.Services.PaymentService;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @Autowired
    OrderTakingController orderTakingController;

    @PostMapping(value="/makePayment")
    public Boolean makePayment(Payment payment) {
       if(paymentService.makePayment(payment)) {
           return orderTakingController.updateOrderStatus(payment.getOrderId(), OrderStatus.COMPLETED)!=0;
       } else {
           return false;
       }
    }
}
