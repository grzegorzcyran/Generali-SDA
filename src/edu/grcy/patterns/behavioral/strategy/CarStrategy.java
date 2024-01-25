package edu.grcy.patterns.behavioral.strategy;

public class CarStrategy implements TravelStrategy{
    private boolean includePaidMotorways;
    private boolean includeFieldRoads;

    public CarStrategy(boolean includePaidMotorways, boolean includeFieldRoads) {
        this.includePaidMotorways = includePaidMotorways;
        this.includeFieldRoads = includeFieldRoads;
    }

    @Override
    public String setTravelPlan(String from, String to) {
        String result = new StringBuilder("Travel by car from ")
                .append(from)
                .append(" to ")
                .append(to)
                .append(includePaidMotorways ? "including paid motorways"  : "")
                .append(includeFieldRoads ? " including field roads" : "")
                .toString();
        return result;
    }
}
