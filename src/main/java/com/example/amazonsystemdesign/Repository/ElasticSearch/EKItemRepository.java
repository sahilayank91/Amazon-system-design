package com.example.amazonsystemdesign.Repository.ElasticSearch;

import com.example.amazonsystemdesign.Model.SearchItemModel;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface EKItemRepository extends ElasticsearchRepository<SearchItemModel, String> {

    @Query("{\"bool\": {\"must\": [{\"match_all\": {\"_name\": \"?0\"}}]}}")
    List<SearchItemModel> findByName(String name);
}