package com.swingspringer.practice.Playground.designpatterns.structural.adapter;

import com.swingspringer.practice.Playground.designpatterns.creational.abstractfactory.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UniversalPaymentAdapter implements IPaymentService {
    private StripePaymentService adaptee;

    @Override
    public Payment createStripePayment(Order order) {
        StripeOrder stripeOrder = convertOrderToStripeOrder(order);
        StripePayment stripePayment = adaptee.createStripePayment(stripeOrder);
        return convertStripePaymentToPayment(stripePayment);
    }

    private Payment convertStripePaymentToPayment(StripePayment stripePayment) {
        return null;
    }

    private StripeOrder convertOrderToStripeOrder(Order order) {
        return new StripeOrder();
    }
}
