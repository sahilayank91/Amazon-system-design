package com.example.amazonsystemdesign.Services;

import com.example.amazonsystemdesign.Model.Item;
import com.example.amazonsystemdesign.Model.SearchItemModel;
import com.example.amazonsystemdesign.Repository.ElasticSearch.EKItemRepository;
import com.example.amazonsystemdesign.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private EKItemRepository ekItemRepository;

    public void addItem(Item item){
        itemRepository.save(item);
        SearchItemModel searchItemModel = new SearchItemModel();
        searchItemModel.setItemId(item.getId());
        searchItemModel.setName(item.getName());
        ekItemRepository.save(searchItemModel);
        return;
    }

    public void deleteItem(String itemId){
        itemRepository.deleteById(itemId);
    }

    public List<Item> retrieveAllItems(){
        return itemRepository.findAll();
    }
}
