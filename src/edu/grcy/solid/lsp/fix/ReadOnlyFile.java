package edu.grcy.solid.lsp.fix;

public class ReadOnlyFile implements FileReadable {
    @Override
    public byte[] read() {
        System.out.println("Klasa ReadOnlyFile implementuje tylko jeden interfejs");
        return new byte[0];
    }

    /**
     * klasa ReadOnlyFile nie implementuje obu interfejsów bo nie ma takiej potrzeby
     * wykorzystuje tylko odczytywanie
     */
}
