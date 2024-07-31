package com.swingspringer.practice.Playground.designpatterns.behavioral.memento;

public class Editor {
    private CommandHistory commandHistory;

    // Also known as save the command
    public void executeCommand(Command command) {
        commandHistory.addCommand(command);
    }

    public void undoLastCommand() {
        // Undo the last command
        Command lastCommand = commandHistory.undoLastCommand();
        // Maybe something like editor.unExecute(command);
    }



}
