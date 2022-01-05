# Amazon-system-design
System design of E-commerce application

## Features of this E commerce system
1) Customer registration
2) Seller registration
3) CRUD operation on any item.
4) CRUD operation on Orders.
5) Elasticsearch implementation to optimize the searching of the items available.
6) Cron jobs scheduling to archive the order which are already placed from Mysql to MongoDB.
7) Make Asynchronous calls for payment using @Async and CompletableFuture

## TO-DO
1) Write AsyncConfiguration class and increase the size of the thread pool.
2) Write CRUD opeartion for ElasticSearch.
3) Enable Kafka topics for Search, Order etc capabilities.
