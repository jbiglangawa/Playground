package com.swingspringer.practice.Playground.designpatterns.structural.composite;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private List<Box> boxes;

    /**
     * Composition is you'd delegate tasks to sub-classes for a specific need
     */
    public BigDecimal getTotalPrice() {
        return boxes.stream()
                .map(Box::getTotalPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
