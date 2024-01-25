package edu.grcy.patterns.behavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new AllegroMediator();
        Customer customer1 = new AllegroCustomer(mediator, "Janek");
        Customer customer2 = new AllegroCustomer(mediator, "Marek");
        Customer customer3 = new AllegroCustomer(mediator, "Wojtek");

        mediator.addBuyer(customer1);
        mediator.addBuyer(customer2);
        mediator.addBuyer(customer3);

        customer1.bid(20);
        customer2.bid(30);
        customer3.bid(25);

        System.out.println("=====================");
        mediator.findHighestBidder();
        System.out.println("=====================");
        customer2.cancelTheBid();
        mediator.findHighestBidder();


    }
}
