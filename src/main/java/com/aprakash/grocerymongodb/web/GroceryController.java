package com.aprakash.grocerymongodb.web;

import com.aprakash.grocerymongodb.dto.GroceryDto;
import com.aprakash.grocerymongodb.model.GroceryItem;
import com.aprakash.grocerymongodb.repository.ItemRepository;
import com.aprakash.grocerymongodb.services.GroceryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroceryController {

    // ItemRepository groceryItemRepo;

    @Autowired
    GroceryService groceryService;

    @PostMapping("/create")
    public GroceryItem createGrocery(@RequestBody @Valid GroceryDto groceryDto) {
        return groceryService.createGrocery(groceryDto.getId(), groceryDto.getName(), groceryDto.getQuantity(), groceryDto.getCategory());
    }

    @GetMapping("/count")
    public long groceryItemsCount() {
        System.out.println(groceryService.itemsCount());
        return groceryService.itemsCount();
    }

}
