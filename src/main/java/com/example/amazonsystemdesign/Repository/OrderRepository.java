package com.example.amazonsystemdesign.Repository;

import com.example.amazonsystemdesign.Model.OrderRequest;
import com.example.amazonsystemdesign.Model.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface OrderRepository extends JpaRepository<OrderRequest, String> {
    List<OrderRequest> findAllByStatus(OrderStatus status);

    @Modifying
    @Transactional
    @Query("UPDATE OrderRequest o SET o.status = :status WHERE o.id = :id")
    Integer updateOrderStatus(String id, OrderStatus status);
}