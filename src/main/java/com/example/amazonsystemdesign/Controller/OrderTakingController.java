package com.example.amazonsystemdesign.Controller;

import com.example.amazonsystemdesign.Model.OrderRequest;
import com.example.amazonsystemdesign.Services.OrderTakingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderTakingController {

    @Autowired
    private OrderTakingService orderTakingService;

    @PostMapping(value="/createOrder")
    public OrderRequest createOrder(OrderRequest order){
        return orderTakingService.createOrder(order);
    }

    @GetMapping("/getAllOrders")
    public List<OrderRequest> getAllOrders() {
        return orderTakingService.getAllOrders();
    }
}
