package com.swingspringer.practice.Playground.designpatterns.behavioral.visitor;

public interface Visitor {
    void accept(Notification notification);
    void doForGuideCx(Notification notification);
    void doForHubspot(Notification notification);
    void doForShopify(Notification notification);
}
