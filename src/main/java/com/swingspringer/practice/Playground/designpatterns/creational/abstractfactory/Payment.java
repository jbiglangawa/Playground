package com.swingspringer.practice.Playground.designpatterns.creational.abstractfactory;

import java.util.UUID;

public interface Payment {
    UUID getPaymentId();
    Double getAmount();
    User getSender();
    User getReceiver();
}
