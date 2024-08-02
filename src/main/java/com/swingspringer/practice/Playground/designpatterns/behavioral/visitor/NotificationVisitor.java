package com.swingspringer.practice.Playground.designpatterns.behavioral.visitor;

public class NotificationVisitor implements Visitor {

    @Override
    public void accept(Notification notification) {
        notification.accept(this);
    }

    @Override
    public void doForGuideCx(Notification notification) {

    }

    @Override
    public void doForHubspot(Notification notification) {

    }

    @Override
    public void doForShopify(Notification notification) {

    }
}
