package edu.grcy.solid.lsp;

public class ReadOnlyFile implements FileOperation {
    @Override
    public byte[] read() {
        return new byte[0];
    }

    /**
     * głównym przebiegiem programu nie może być rzucanie wyjątku
     * czyli w tym przypadku nie działa LSP
     * bo w zależności od klasy
     * albo metoda działa albo rzuca wyjątek
     */
    @Override
    public void write(byte[] data) {
        throw new UnsupportedOperationException();
    }
}
