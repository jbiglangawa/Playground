package com.swingspringer.practice.Playground.designpatterns.behavioral.memento;

import java.util.UUID;

public class EditCommand implements Command {
    private UUID id;
    private String command;

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public String getCommand() {
        return command;
    }
}
