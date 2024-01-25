package edu.grcy.patterns.behavioral.strategy;

public class Travel {
    private String startPoint;
    private String destination;
    private String finalPlan;

    public Travel(String startPoint, String destination) {
        this.startPoint = startPoint;
        this.destination = destination;
    }

    public void setTravelPlan(TravelStrategy travelPlan) {
        finalPlan = travelPlan.setTravelPlan(startPoint, destination);
    }

    public void getTravelInfo() {
        System.out.println("Travelling from " + startPoint + " to " + destination);
        System.out.println("==== DETAILS ====");
        System.out.println(finalPlan);
        System.out.println("=================");
    }
}
