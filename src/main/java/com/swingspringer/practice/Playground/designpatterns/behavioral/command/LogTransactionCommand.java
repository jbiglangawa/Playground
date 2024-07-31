package com.swingspringer.practice.Playground.designpatterns.behavioral.command;

public class LogTransactionCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Logging transaction...");
    }
}
