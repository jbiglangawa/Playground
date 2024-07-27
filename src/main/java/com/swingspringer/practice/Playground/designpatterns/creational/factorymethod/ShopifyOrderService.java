package com.swingspringer.practice.Playground.designpatterns.creational.factorymethod;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Qualifier("shopifyOrderService")
public class ShopifyOrderService implements IOrderService {
    @Override
    public Transaction createTransaction() {
        return new ShopifyTransaction(UUID.randomUUID(), "00000-00001", List.of("shopify product 1", "shopify product 2"));
    }
}
