package com.aprakash.grocerymongodb.web;

import com.aprakash.grocerymongodb.dto.GroceryDto;
import com.aprakash.grocerymongodb.responses.GroceryItemsCountResponse;
import com.aprakash.grocerymongodb.model.GroceryItem;
import com.aprakash.grocerymongodb.responses.ItemByNameResponse;
import com.aprakash.grocerymongodb.responses.ItemsByCategoryResponse;
import com.aprakash.grocerymongodb.services.GroceryService;
import io.sentry.Sentry;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GroceryController {

    @Autowired
    GroceryService groceryService;

    @PostMapping("/create")
    public GroceryItem createGrocery(@RequestBody @Valid GroceryDto groceryDto) {
        return groceryService.createGrocery(groceryDto.getId(), groceryDto.getName(), groceryDto.getQuantity(), groceryDto.getCategory());
    }

    @GetMapping("/count")
    public GroceryItemsCountResponse groceryItemsCount() {
        Sentry.setTransaction("Groceries Count transaction");
        Sentry.addBreadcrumb("Gonna count all items now... ");
        return groceryService.itemsCount();
    }

    @GetMapping("/items/category/{category}")
    public ItemsByCategoryResponse<GroceryItem> getItemsByCategory(@PathVariable @Valid String category) {
        return groceryService.getItemsByCategory(category);
    }

    @GetMapping("items/name/{name}")
    public ItemByNameResponse getItemByName(@PathVariable @Valid String name) {
        return groceryService.getItemByName(name);
    }
}
