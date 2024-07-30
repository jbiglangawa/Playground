package com.swingspringer.practice.Playground.designpatterns.structural.decorator;

public class PdfPrinter implements Printer {
    private String pdfFilename;
    private String fileLocation;

    @Override
    public void print() {
        System.out.println(pdfFilename);
    }
}
