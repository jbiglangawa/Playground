package com.swingspringer.practice.Playground.designpatterns.creational.abstractfactory;

import java.util.List;

public class InstaPayPaymentFactory implements PaymentFactory {
    @Override
    public Payment createOneTimePayment() {
        return new InstaPayPayment();
    }

    @Override
    public List<Payment> createInstallmentPayment() {
        return List.of(new InstaPayPayment());
    }

    @Override
    public Payment createCreditPayment() {
        return new InstaPayPayment();
    }
}
