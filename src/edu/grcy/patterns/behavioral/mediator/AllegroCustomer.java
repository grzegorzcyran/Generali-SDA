package edu.grcy.patterns.behavioral.mediator;

public class AllegroCustomer extends Customer {

    public AllegroCustomer(Mediator med, String name) {
        super(med, name);
    }

    @Override
    public void bid(int price) {
        this.price = price;

    }

    @Override
    public void cancelTheBid() {
        this.price = -1;
    }
}
