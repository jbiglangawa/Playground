package com.swingspringer.practice.Playground.designpatterns.structural.decorator;

public class HeaderPrinterDecorator extends BasePrinterDecorator {
    @Override
    public void print() {
        // Add header to the PDF file
        // Then call super print
        super.print();
    }
}
