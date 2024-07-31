package com.swingspringer.practice.Playground.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public Command undoLastCommand() {
        Command command = commands.getLast();
        commands.remove(command);
        return command;
    }
}
