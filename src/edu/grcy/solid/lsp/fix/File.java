package edu.grcy.solid.lsp.fix;

public class File implements FileReadable, FileWritable {
    @Override
    public byte[] read() {
        return new byte[0];
    }

    @Override
    public void write(String message) {
        System.out.println("writing: " + message);
    }
}
