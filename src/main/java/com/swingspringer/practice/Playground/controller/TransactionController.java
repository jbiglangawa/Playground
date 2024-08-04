package com.swingspringer.practice.Playground.controller;

import com.swingspringer.practice.Playground.dto.TransactionRequest;
import com.swingspringer.practice.Playground.dto.TransactionResponse;
import com.swingspringer.practice.Playground.entity.Transaction;
import com.swingspringer.practice.Playground.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/transaction")
@RequiredArgsConstructor
public class TransactionController {
    private final TransactionRepository transactionRepository;

    @PostMapping
    public TransactionResponse saveTransaction(@RequestBody TransactionRequest transactionRequest) {
        Transaction savedTransaction = transactionRepository.saveTransaction(Transaction.builder()
                .hashKey(transactionRequest.getHashKey())
                .test(transactionRequest.getTest())
                .build());

        TransactionResponse response = new TransactionResponse();
        if(savedTransaction.getTransactionId() != null) {
            response.setSuccess(true);
            response.setGeneratedTransactionId(savedTransaction.getTransactionId());
        }else {
            response.setSuccess(false);
        }

        return response;
    }

}
