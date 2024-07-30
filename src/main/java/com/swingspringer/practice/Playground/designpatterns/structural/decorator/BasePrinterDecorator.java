package com.swingspringer.practice.Playground.designpatterns.structural.decorator;

public class BasePrinterDecorator {
    private Printer wrappee;

    public void print() {
        wrappee.print();
    }
}
