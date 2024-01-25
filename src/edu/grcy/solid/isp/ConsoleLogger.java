package edu.grcy.solid.isp;

import java.util.Collection;

public class ConsoleLogger implements Logger {
    @Override
    public void writeMessage(String message) {
        System.out.println("New line to console output : " + message);
    }

    @Override
    public Collection<String> readMessages() {
        throw new UnsupportedOperationException();
    }
}
