package com.swingspringer.practice.Playground.designpatterns.behavioral.memento;

import java.util.UUID;

public interface Command {
    UUID getId();
    String getCommand();
}
