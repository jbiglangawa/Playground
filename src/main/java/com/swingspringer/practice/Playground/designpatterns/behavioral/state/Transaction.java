package com.swingspringer.practice.Playground.designpatterns.behavioral.state;

import lombok.Getter;

public class Transaction {
    private TransactionState transactionState;

    @Getter
    private double amount;
    @Getter
    private int numberOfPayments;

    public double getTotalAmount() {
        return transactionState.getTotalAmount(this);
    }
}
