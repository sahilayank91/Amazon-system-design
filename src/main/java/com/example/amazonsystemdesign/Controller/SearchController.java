package com.example.amazonsystemdesign.Controller;

import com.example.amazonsystemdesign.Model.Item;
import com.example.amazonsystemdesign.Model.SearchItemModel;

import com.example.amazonsystemdesign.Services.SearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class SearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping("/searchItem/{enteredText}")
    public List<SearchItemModel> searchItem(@PathVariable String enteredText){
        return searchService.searchItem(enteredText);
    }
}
