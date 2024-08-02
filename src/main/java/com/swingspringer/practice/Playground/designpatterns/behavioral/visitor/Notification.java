package com.swingspringer.practice.Playground.designpatterns.behavioral.visitor;

public interface Notification {
    void sendNotification();
    void accept(Visitor visitor);
}
