package edu.grcy.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AllegroMediator implements Mediator {
    private ArrayList<Customer> biddingCustomers;

    public AllegroMediator()
    {
        biddingCustomers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Customer customer)
    {
        biddingCustomers.add(customer);
        System.out.println(customer.name + " was added to " +
                "the buyers list.");
    }

    @Override
    public void findHighestBidder()
    {
        int maxBid = 0;
        Customer winner = null;
//        for (Customer customer : biddingCustomers) {
//            if (customer.price > maxBid) {
//                maxBid = customer.price;
//                winner = customer;
//            }
//        }

        winner = Collections.max(biddingCustomers,
                Comparator.comparing(c -> c.price));

        System.out.println("The auction winner is " + winner.name +
                ". He paid " + winner.price + "$ for the item.");
    }
}
