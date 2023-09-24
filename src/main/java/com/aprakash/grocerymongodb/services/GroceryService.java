package com.aprakash.grocerymongodb.services;

import com.aprakash.grocerymongodb.model.GroceryItem;
import com.aprakash.grocerymongodb.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GroceryService {

    @Autowired
    ItemRepository groceryItemRepo;
    GroceryItem groceryItem;

    public GroceryService() {}

    public long itemsCount() {
        return groceryItemRepo.count();
    }

    public GroceryItem createGrocery(String id, String name, int quantity, String category) {
        GroceryItem grocery = new GroceryItem();
        grocery.setId(id);
        grocery.setName(name);
        grocery.setQuantity(quantity);
        grocery.setCategory(category);

        groceryItemRepo.save(grocery);

        return grocery;
    }
}
