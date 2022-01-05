package com.example.amazonsystemdesign.Services;

import com.example.amazonsystemdesign.Model.OrderRequest;
import com.example.amazonsystemdesign.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderTakingService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderRequest createOrder(OrderRequest order){
        return orderRepository.save(order);
    }

    public List<OrderRequest> getAllOrders() {
        return orderRepository.findAll();
    }
}
