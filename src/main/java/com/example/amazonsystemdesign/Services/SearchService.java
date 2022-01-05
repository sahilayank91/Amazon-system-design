package com.example.amazonsystemdesign.Services;

//import com.example.amazonsystemdesign.Repository.ElasticSearch.EKItemRepository;
import com.example.amazonsystemdesign.Repository.ElasticSearch.EKItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;
import com.example.amazonsystemdesign.Model.SearchItemModel;

import java.util.List;

import static org.elasticsearch.index.query.QueryBuilders.matchQuery;

@Service
public class SearchService {

    @Autowired
    private EKItemRepository ekItemRepository;

    public List<SearchItemModel> searchItem(String enteredText){
//        NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
//                .withQuery(matchQuery("name", enteredText))
//                .build();
//        SearchHits<SearchItemModel> articles = se()
//                .search(searchQuery, SearchItemModel.class, IndexCoordinates.of("blog"));
        return ekItemRepository.findByName(enteredText);
    }

}
