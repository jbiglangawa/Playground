package com.swingspringer.practice.Playground.designpatterns.structural.bridge;

public class StripePayment implements Payment {
    private User user;

    @Override
    public Long getId() {
        return 1l;
    }

    @Override
    public User getUser() {
        return user;
    }
}
