package com.aprakash.grocerymongodb.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.sentry.Sentry;

public class GroceryItemsCountResponse {

    @JsonProperty("items_count")
    private long groceryCount;

    public GroceryItemsCountResponse() {}

    public GroceryItemsCountResponse(Long groceryCount) {
        this.groceryCount = groceryCount;
    }

    public long getGroceryCount() {
        return groceryCount;
    }

    public void setGroceryCount(long groceryCount) {
        Sentry.addBreadcrumb("Setting grocery Count now..... ");
        this.groceryCount = groceryCount;
        Sentry.captureMessage("Successfully set grocery count..... ");
    }

}
