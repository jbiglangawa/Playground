package com.swingspringer.practice.Playground.designpatterns.structural.adapter;

import com.swingspringer.practice.Playground.designpatterns.creational.abstractfactory.Payment;

public interface IPaymentService {
    Payment createStripePayment(Order order);
}
