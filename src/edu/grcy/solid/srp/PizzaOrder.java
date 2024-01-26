package edu.grcy.solid.srp;

import java.util.Random;

public class PizzaOrder {

    private String orderId;
    private String itemName;
    private int quantity;
    private int totalBillAmt;

    public void receiveOrder(String name, int quantity) {
        System.out.println("Receiving order for pizza from customer");
        this.orderId = String.valueOf(new Random().nextInt());
        this.itemName = name;
        this.quantity = quantity;
    }

    public void preparePizza() {
        System.out.println("Preparing pizza " + itemName + " for customer");
    }

    public void calculateBill() {
        Random rand = new Random();
        int totalAmt = rand.nextInt(200) * this.quantity;
        this.totalBillAmt = totalAmt;
        System.out.println("Order with order id has a total bill amount of " + this.totalBillAmt);
    }

    public void delivery() {
        System.out.println("Delivering the order " +orderId);
        System.out.println("Order is to be delivered to: ");
    }
}

