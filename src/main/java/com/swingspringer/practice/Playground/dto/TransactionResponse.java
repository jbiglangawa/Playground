package com.swingspringer.practice.Playground.dto;

import lombok.Data;

@Data
public class TransactionResponse {
    private boolean success;
    private String generatedTransactionId;
}
