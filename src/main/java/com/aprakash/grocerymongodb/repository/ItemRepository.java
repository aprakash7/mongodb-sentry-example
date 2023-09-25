package com.aprakash.grocerymongodb.repository;

import com.aprakash.grocerymongodb.model.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ItemRepository extends MongoRepository<GroceryItem, String> {

    @Query("{name: '?0'}")
    GroceryItem findItemByName(String name);

    @Query(value = "{category: '?0'}")
    List<GroceryItem> findAll(String category);

}
