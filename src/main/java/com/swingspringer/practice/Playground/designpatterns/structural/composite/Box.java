package com.swingspringer.practice.Playground.designpatterns.structural.composite;

import java.math.BigDecimal;
import java.util.List;

public class Box {
    private List<Item> items;

    public BigDecimal getTotalPrice() {
        return items.stream()
                .map(Item::getAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
