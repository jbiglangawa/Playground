package com.swingspringer.practice.Playground.designpatterns.creational.factorymethod;

import java.util.List;
import java.util.UUID;

public class ShopifyTransaction implements Transaction {
    private final UUID transactionId;
    private final String orderNumber;
    private final List<String> cartProducts;

    public ShopifyTransaction(UUID transactionId, String orderNumber, List<String> cartProducts) {
        this.transactionId = transactionId;
        this.orderNumber = orderNumber;
        this.cartProducts = cartProducts;
    }

    @Override
    public UUID getTransactionId() {
        return null;
    }

    @Override
    public String getOrderNumber() {
        return "";
    }

    @Override
    public List<String> getCartProducts() {
        return List.of();
    }
}
