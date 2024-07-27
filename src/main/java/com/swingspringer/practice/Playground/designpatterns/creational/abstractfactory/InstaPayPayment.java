package com.swingspringer.practice.Playground.designpatterns.creational.abstractfactory;

import java.util.UUID;

public class InstaPayPayment implements Payment {
    @Override
    public UUID getPaymentId() {
        return null;
    }

    @Override
    public Double getAmount() {
        return 0.0;
    }

    @Override
    public User getSender() {
        return null;
    }

    @Override
    public User getReceiver() {
        return null;
    }
}
