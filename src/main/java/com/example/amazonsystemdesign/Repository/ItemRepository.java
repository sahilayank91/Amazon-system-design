package com.example.amazonsystemdesign.Repository;

import com.example.amazonsystemdesign.Model.Item;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.function.Function;

public interface ItemRepository extends JpaRepository<Item, String> {

}