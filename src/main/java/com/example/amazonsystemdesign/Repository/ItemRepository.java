package com.example.amazonsystemdesign.Repository;

import com.example.amazonsystemdesign.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {

}