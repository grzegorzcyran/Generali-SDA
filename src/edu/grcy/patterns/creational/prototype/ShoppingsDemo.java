package edu.grcy.patterns.creational.prototype;

import java.util.List;

public class ShoppingsDemo {
    public static void main(String[] args) {

        ShoppingList original = new ShoppingList();

        try {
            ShoppingList shoppingsForMonday = (ShoppingList) original.clone();
            List<String> mondayList = shoppingsForMonday.getShoppings();
            mondayList.remove("chleb");
            mondayList.add("sok pomidorowy");
            mondayList.add("Mars x6");
            shoppingsForMonday.setShoppings(mondayList);
            System.out.println("Monday shoppings:");
            shoppingsForMonday.getShoppings().forEach(System.out::println);

            System.out.println("=============================");
            ShoppingList shoppingsForFriday = (ShoppingList) original.clone();
            List<String> fridayList = shoppingsForFriday.getShoppings();
            fridayList.remove("pomidory");
            fridayList.add("Ballentines");
            fridayList.add("cola x2");
            fridayList.add("Coś na grilla");
            shoppingsForFriday.setShoppings(fridayList);
            System.out.println("Friday shoppings:");
            shoppingsForFriday.getShoppings().forEach(System.out::println);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
