package com.example.amazonsystemdesign.Repository.ArchivalRepository;

import com.example.amazonsystemdesign.Model.OrderRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRequestArchivalRepository extends MongoRepository<OrderRequest, String> {



}