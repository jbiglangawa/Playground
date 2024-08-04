package com.swingspringer.practice.Playground.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.swingspringer.practice.Playground.entity.Transaction;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TransactionRepository {
    private final DynamoDBMapper dynamoDBMapper;

    public Transaction saveTransaction(Transaction transaction) {
        dynamoDBMapper.save(transaction);
        return transaction;
    }
}
