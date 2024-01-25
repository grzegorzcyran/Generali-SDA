package edu.grcy.solid.lsp.fix;

@FunctionalInterface
public interface FileWritable {
    void write(String message);
}
