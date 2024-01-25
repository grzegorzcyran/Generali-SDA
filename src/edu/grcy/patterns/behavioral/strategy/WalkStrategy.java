package edu.grcy.patterns.behavioral.strategy;

public class WalkStrategy implements TravelStrategy {
    private boolean includeTouristicPaths;

    public WalkStrategy(boolean includeTouristicPaths) {
        this.includeTouristicPaths = includeTouristicPaths;
    }

    @Override
    public String setTravelPlan(String from, String to) {
        return new StringBuilder("Travel by foot from ")
                .append(from)
                .append(" to ")
                .append(to)
                .append(includeTouristicPaths ? " including touristic paths" : "")
                .toString();

    }
}
