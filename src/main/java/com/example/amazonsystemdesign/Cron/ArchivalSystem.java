package com.example.amazonsystemdesign.Cron;

import com.example.amazonsystemdesign.Model.OrderRequest;
import com.example.amazonsystemdesign.Model.OrderStatus;
import com.example.amazonsystemdesign.Repository.ArchivalRepository.OrderRequestArchivalRepository;
import com.example.amazonsystemdesign.Repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@EnableScheduling
@Slf4j
public class ArchivalSystem {

    /* Enable cron jobs here
     */

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderRequestArchivalRepository orderRequestArchivalRepository;

    @Scheduled(fixedDelay = 1000)
    public void archiveOrderToMongo(){
        List<OrderRequest> orderRequestList = orderRepository.findAllByStatus(OrderStatus.PLACED);
        orderRequestArchivalRepository.saveAll(orderRequestList);
        log.debug(orderRequestList.toString());
    }
}
