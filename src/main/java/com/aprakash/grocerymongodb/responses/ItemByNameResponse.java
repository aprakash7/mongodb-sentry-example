package com.aprakash.grocerymongodb.responses;

import com.aprakash.grocerymongodb.model.GroceryItem;

public class ItemByNameResponse {

    private GroceryItem groceryItem;

    public ItemByNameResponse(GroceryItem groceryItem) {
        this.groceryItem = groceryItem;
    }

    public GroceryItem getName() {
        return groceryItem;
    }

    public void setName(GroceryItem groceryItem) {
        this.groceryItem = groceryItem;
    }
}
