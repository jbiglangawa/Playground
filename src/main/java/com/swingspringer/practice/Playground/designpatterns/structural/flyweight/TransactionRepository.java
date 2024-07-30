package com.swingspringer.practice.Playground.designpatterns.structural.flyweight;

public class TransactionRepository {
    // transactionType would come from a flyweight factory instead of from the transaction object itself.
    public void saveTransaction(TransactionType transactionType, Transaction transaction) {
        // repository.save(transactionType, transaction);
    }

}
