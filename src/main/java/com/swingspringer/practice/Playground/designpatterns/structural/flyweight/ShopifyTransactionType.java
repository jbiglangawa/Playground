package com.swingspringer.practice.Playground.designpatterns.structural.flyweight;

public class ShopifyTransactionType implements TransactionType {
    @Override
    public String getTransactionType() {
        return "Shopify";
    }
}
