package com.swingspringer.practice.Playground.designpatterns.structural.adapter;

import org.springframework.stereotype.Service;

/**
 * This is the 3rd-party service in this example
 */
@Service
public class StripePaymentService {

    public StripePayment createStripePayment(StripeOrder order) {
        // Custom logic will happen here
        return new StripePayment();
    }

}
