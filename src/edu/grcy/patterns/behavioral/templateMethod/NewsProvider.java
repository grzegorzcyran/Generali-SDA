package edu.grcy.patterns.behavioral.templateMethod;

public abstract class NewsProvider {
    private int id;
    private String message;

    //mamy metody które musimy zaimplementować
    public abstract boolean authorize();

    //mamy metodę która jest na stałe, nie można jej zmieniać (final)
    public final boolean sendMessage() {
        System.out.println("Message sent:"+message);
        return true;
    }


    //mamy metody które możemy / musimy zaimplementować
    public boolean endConnection() {
        System.out.println(" Generic end connection");
        return true;
    }

    //mamy finalną metodę która definiuje jakiś algorytm,
    //czy ścieżkę wykonania
    //kolejności wykonania nie można zmieniać
    //ale można / trzeba dopisać kod do metod abstrakcyjnych i / lub niefinalnych
    public final void provideNews() {
        authorize();
        sendMessage();
        endConnection();
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
