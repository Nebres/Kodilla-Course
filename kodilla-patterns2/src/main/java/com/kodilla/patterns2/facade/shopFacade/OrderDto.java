package com.kodilla.patterns2.facade.shopFacade;

import java.util.ArrayList;
import java.util.List;

public class OrderDto {

    List<ItemDto> items = new ArrayList<>();

    public void addItem(final ItemDto item) {
        items.add(item);
    }

    public List<ItemDto> getItems() {
        return items;
    }
}
