package com.swingspringer.practice.Playground.designpatterns.creational.prototype;

public class Document implements Prototype<Document> {
    private String name;
    private String text;

    public Document(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public Document clone() {
        return new Document(this.name, this.text);
    }
}
