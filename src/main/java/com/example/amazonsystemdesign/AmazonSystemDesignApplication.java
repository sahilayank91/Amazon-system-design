package com.example.amazonsystemdesign;

import com.example.amazonsystemdesign.Repository.ElasticSearch.EKItemRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableElasticsearchRepositories(basePackageClasses = EKItemRepository.class)
@EnableJpaRepositories(excludeFilters =
@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = EKItemRepository.class))
@SpringBootApplication
public class AmazonSystemDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmazonSystemDesignApplication.class, args);
    }

}
