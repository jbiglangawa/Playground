package com.swingspringer.practice.Playground.designpatterns.behavioral.chainofresponsibility;

public interface RequestHandler {
    void setNextHandler(RequestHandler requestHandler);
    void handle(Request request);
}
