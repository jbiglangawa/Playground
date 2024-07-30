package com.swingspringer.practice.Playground.designpatterns.structural.bridge;

public class GCashPayment implements Payment {
    private User user;

    @Override
    public Long getId() {
        return 1L;
    }

    @Override
    public User getUser() {
        return user;
    }
}
