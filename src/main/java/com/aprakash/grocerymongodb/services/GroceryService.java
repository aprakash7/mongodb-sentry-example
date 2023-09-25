package com.aprakash.grocerymongodb.services;

import com.aprakash.grocerymongodb.responses.GroceryItemsCountResponse;
import com.aprakash.grocerymongodb.model.GroceryItem;
import com.aprakash.grocerymongodb.repository.ItemRepository;
import com.aprakash.grocerymongodb.responses.ItemByNameResponse;
import com.aprakash.grocerymongodb.responses.ItemsByCategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GroceryService {

    @Autowired
    ItemRepository groceryItemRepo;
    GroceryItem groceryItem;

    public GroceryService() {}

    public GroceryItemsCountResponse itemsCount() {
        GroceryItemsCountResponse groceriesCount = new GroceryItemsCountResponse();
        groceriesCount.setGroceryCount(groceryItemRepo.count());
        return groceriesCount;
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

   public ItemsByCategoryResponse<GroceryItem> getItemsByCategory(String category) {
       List<GroceryItem> items = groceryItemRepo.findAll(category);
       return new ItemsByCategoryResponse<GroceryItem>(items);
   }

   public ItemByNameResponse getItemByName(String name) {
        GroceryItem item =  groceryItemRepo.findItemByName(name);
        return new ItemByNameResponse(item);
   }
}
