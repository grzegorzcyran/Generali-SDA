package edu.grcy.patterns.behavioral.state;

public class Flying implements FlightState {
    private static Flying instance = new Flying();

    private Flying() {
    }

    public static Flying getInstance() {
        return instance;
    }

    @Override
    public void updateState(Flight flight) {
        System.out.println("Flying. Crew is serving meals!");
        flight.setStatus(Landing.getInstance());
    }

    @Override
    public void performAction(Flight flight) {
        System.out.println("No need to fasten seatbelts");
    }
}
