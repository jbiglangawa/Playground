package com.swingspringer.practice.Playground.designpatterns.behavioral.state;

public interface TransactionState {
    double getTotalAmount(Transaction transaction);
}
