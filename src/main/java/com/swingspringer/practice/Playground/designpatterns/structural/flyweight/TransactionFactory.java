package com.swingspringer.practice.Playground.designpatterns.structural.flyweight;

public class TransactionFactory {
    private final TransactionType shopifyTransactionType = new ShopifyTransactionType();

    public TransactionType getShopifyTransactionType() {
        return shopifyTransactionType;
    }


}
