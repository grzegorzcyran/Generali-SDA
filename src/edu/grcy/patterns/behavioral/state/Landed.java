package edu.grcy.patterns.behavioral.state;

public class Landed implements FlightState {
    private static Landed instance = new Landed();

    private Landed() {
    }

    public static Landed getInstance() {
        return instance;
    }

    @Override
    public void updateState(Flight flight) {
        System.out.println("Landed. Enjoy your stay!");
    }

    @Override
    public void performAction(Flight flight) {
        System.out.println("Cabin crew wishes all the best!! Remember to take your baggage.");
    }
}
