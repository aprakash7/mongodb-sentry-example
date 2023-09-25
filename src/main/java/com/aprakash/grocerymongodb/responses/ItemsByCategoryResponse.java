package com.aprakash.grocerymongodb.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ItemsByCategoryResponse<T> {

    @JsonProperty("items")
    private List<T> items;

    public ItemsByCategoryResponse(List<T> items) {
        this.items = items;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
