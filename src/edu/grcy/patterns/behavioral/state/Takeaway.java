package edu.grcy.patterns.behavioral.state;

public class Takeaway implements FlightState {

    private static Takeaway instance = new Takeaway();

    private Takeaway() {
    }

    public static Takeaway getInstance() {
        return instance;
    }

    @Override
    public void updateState(Flight flight) {
        System.out.println("Takeaway. Please remain seated!");
        flight.setStatus(Flying.getInstance());
    }

    @Override
    public void performAction(Flight flight) {
        System.out.println("No action when takeaway");
    }
}
