package com.example.amazonsystemdesign.Repository;

import com.example.amazonsystemdesign.Model.OrderRequest;
import com.example.amazonsystemdesign.Model.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderRequest, String> {
    List<OrderRequest> findAllByStatus(OrderStatus status);
}