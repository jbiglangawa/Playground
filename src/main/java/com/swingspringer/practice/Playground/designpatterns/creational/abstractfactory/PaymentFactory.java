package com.swingspringer.practice.Playground.designpatterns.creational.abstractfactory;

import java.util.List;

public interface PaymentFactory {
    Payment createOneTimePayment();
    List<Payment> createInstallmentPayment();
    Payment createCreditPayment();
}
