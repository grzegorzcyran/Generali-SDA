package edu.grcy.patterns.behavioral.mediator;

public abstract class Customer {

    protected Mediator mediator;
    protected String name;
    protected int price;

    public Customer(Mediator med, String name) {
        this.mediator = med;
        this.name = name;
    }

    public abstract void bid(int price);

    public abstract void cancelTheBid();
}
