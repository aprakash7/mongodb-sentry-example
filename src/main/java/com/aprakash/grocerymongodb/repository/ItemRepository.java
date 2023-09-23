package com.aprakash.grocerymongodb.repository;

import com.aprakash.grocerymongodb.model.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ItemRepository extends MongoRepository<GroceryItem, String> {

    // '?num' indicates parameter num
    @Query("{name: '?0'}")
    GroceryItem findItemByName(String name);


    // 1 indicates that field must be included, 0 indicted excuded
    @Query(value = "{category: '?0'}", fields = "{'name' : 1, 'quantity' : 1}")
    List<GroceryItem> findAll(String category);

    public long count();
}
