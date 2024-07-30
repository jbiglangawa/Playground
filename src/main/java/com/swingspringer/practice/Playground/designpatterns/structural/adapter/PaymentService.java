package com.swingspringer.practice.Playground.designpatterns.structural.adapter;

import com.swingspringer.practice.Playground.designpatterns.creational.abstractfactory.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService {
    @Override
    public Payment createStripePayment(Order order) {
        return null;
    }
}
