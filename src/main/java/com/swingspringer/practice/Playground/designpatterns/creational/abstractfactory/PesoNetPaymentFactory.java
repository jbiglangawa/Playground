package com.swingspringer.practice.Playground.designpatterns.creational.abstractfactory;

import java.util.List;

public class PesoNetPaymentFactory implements PaymentFactory {
    @Override
    public Payment createOneTimePayment() {
        return new PesoNetPayment();
    }

    @Override
    public List<Payment> createInstallmentPayment() {
        return List.of(new PesoNetPayment());
    }

    @Override
    public Payment createCreditPayment() {
        return new PesoNetPayment();
    }
}
