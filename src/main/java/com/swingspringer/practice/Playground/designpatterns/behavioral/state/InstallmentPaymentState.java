package com.swingspringer.practice.Playground.designpatterns.behavioral.state;

public class InstallmentPaymentState implements TransactionState {
    @Override
    public double getTotalAmount(Transaction transaction) {
        return transaction.getAmount() * transaction.getNumberOfPayments();
    }
}
