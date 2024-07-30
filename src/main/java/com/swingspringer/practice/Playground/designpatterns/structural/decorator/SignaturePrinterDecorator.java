package com.swingspringer.practice.Playground.designpatterns.structural.decorator;

public class SignaturePrinterDecorator extends BasePrinterDecorator {
    @Override
    public void print() {
        // Add signature to PDF
        // Then print below
        super.print();
    }
}
