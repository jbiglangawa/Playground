package com.swingspringer.practice.Playground.designpatterns.behavioral.chainofresponsibility;

// Now, this base request can be extended to other handlers.
public class BaseRequestHandler implements RequestHandler {
    private RequestHandler nextHandler;

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /*
        Could also pass as a filter method instead of handle
     */
    @Override
    public void handle(Request request) {
        // Do something
        System.out.println("Handled");

        if(nextHandler != null) {
            nextHandler.handle(request);
        }
    }

}
