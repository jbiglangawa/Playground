package com.swingspringer.practice.Playground.designpatterns.behavioral.visitor;

public class GuideCxNotification implements Notification {
    @Override
    public void sendNotification() {
        // Do something
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.doForGuideCx(this);
    }
}
