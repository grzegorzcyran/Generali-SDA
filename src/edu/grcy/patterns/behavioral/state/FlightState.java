package edu.grcy.patterns.behavioral.state;

public interface FlightState {
    void updateState(Flight flight);

    void performAction(Flight flight);
}
