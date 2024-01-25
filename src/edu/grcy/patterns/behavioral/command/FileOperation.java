package edu.grcy.patterns.behavioral.command;

@FunctionalInterface
public interface FileOperation {
    String performOperation(String content);
}
