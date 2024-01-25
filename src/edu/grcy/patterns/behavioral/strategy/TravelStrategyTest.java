package edu.grcy.patterns.behavioral.strategy;

public class TravelStrategyTest {
    public static void main(String[] args) {
        Travel travel = new Travel("Rzeszów", "Warszawa");

        travel.setTravelPlan(new WalkStrategy(false));
        travel.getTravelInfo();
        System.out.println("---------------------------------------------");
        travel.setTravelPlan(new CarStrategy(true, false));
        travel.getTravelInfo();
        System.out.println("---------------------------------------------");

        Travel travelHolidays = new Travel("Rzeszów", "Beskid Niski");
        travelHolidays.setTravelPlan(new WalkStrategy(true));
        travelHolidays.getTravelInfo();
        System.out.println("---------------------------------------------");
        travelHolidays.setTravelPlan(new CarStrategy(false, true));
        travelHolidays.getTravelInfo();
        System.out.println("---------------------------------------------");

    }
}
