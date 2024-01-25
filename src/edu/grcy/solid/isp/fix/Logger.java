package edu.grcy.solid.isp.fix;

@FunctionalInterface
public interface Logger {
    void writeMessage(String message);
}
