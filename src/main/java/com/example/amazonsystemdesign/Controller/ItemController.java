package com.example.amazonsystemdesign.Controller;

import com.example.amazonsystemdesign.Model.Item;
import com.example.amazonsystemdesign.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping(value = "/addItem")
    public Boolean addItem(Item item){
        itemService.addItem(item);
        return true;
    }

    @PostMapping(value = "/deleteItem")
    public Boolean deleteItem(@RequestBody String itemId){
        itemService.deleteItem(itemId);
        return true;
    }

    @GetMapping("/getAllItems")
    public List<Item> getAllItem(){
        return itemService.retrieveAllItems();
    }



}
