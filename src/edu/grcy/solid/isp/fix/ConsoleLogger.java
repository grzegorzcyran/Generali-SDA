package edu.grcy.solid.isp.fix;

public class ConsoleLogger implements Logger {

    @Override
    public void writeMessage(String message) {
        System.out.println("Write only for Console logger: " + message);
    }
}
