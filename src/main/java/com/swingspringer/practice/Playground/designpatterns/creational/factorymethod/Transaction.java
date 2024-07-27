package com.swingspringer.practice.Playground.designpatterns.creational.factorymethod;

import java.util.List;
import java.util.UUID;

public interface Transaction {
    UUID getTransactionId();
    String getOrderNumber();
    List<String> getCartProducts();
}
