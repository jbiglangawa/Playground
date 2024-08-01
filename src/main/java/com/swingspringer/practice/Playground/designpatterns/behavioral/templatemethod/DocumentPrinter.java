package com.swingspringer.practice.Playground.designpatterns.behavioral.templatemethod;

public abstract class DocumentPrinter {
    private void execute() {
        retrieveText();
        retrieveMetadata();
    }
    public String retrieveText() {
        return "";
    }

    public String retrieveMetadata() {
        return "";
    }
}
