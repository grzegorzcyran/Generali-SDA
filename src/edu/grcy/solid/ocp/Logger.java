package edu.grcy.solid.ocp;

public class Logger {
    private LogDestination destination;

    public Logger(LogDestination destination) {
        this.destination = destination;
    }

    public void log(String log) throws IllegalArgumentException {

        switch (destination) {
            case CONSOLE:
                System.out.println("Writing " + log + " to console.") ;
                break;
            case DB:
                System.out.println("Writing" + log + " to database.");
                break;
            case FILE: //dołożenie nowej metody logowania w metodzie łamie OCP
                // bo modyfikujemy istniejący kod zamiast dodać nowy
                //...
            default:
                throw new IllegalArgumentException("Not supported logging type");
        }
    }
}
