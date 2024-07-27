package com.swingspringer.practice.Playground.designpatterns.creational.factorymethod;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Qualifier("apiOrderService")
public class ApiOrderService implements IOrderService {
    @Override
    public Transaction createTransaction() {
        return new ApiTransaction(UUID.randomUUID(), "00000-00000", List.of("Api product", "Customer product"));
    }
}
