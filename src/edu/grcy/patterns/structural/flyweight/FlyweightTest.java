package edu.grcy.patterns.structural.flyweight;

import java.util.Arrays;
import java.util.List;

public class FlyweightTest {
    public static void main(String[] args) {

        FordMustang mustang1 = new FordMustang("Midnight Sky", "4.5", "Sony");
        FordMustang mustang2 = new FordMustang("Ruby Red", "4.0", "Denon");
        FordMustang mustang3 = new FordMustang("Midnight Sky", "3.5", "Sony");
        FordMustang mustang4 = new FordMustang("Black Panther", "3.5", "Embedded");
        FordMustang mustang5 = new FordMustang("Midnight Sky", "4.5", "Denon");

        List<FordMustang> mustangs = Arrays.asList(mustang1, mustang2, mustang3, mustang4, mustang5);
        System.out.println("====================");
        mustangs.forEach(x -> System.out.println(x.carInfo()));

        System.out.println("====================");
        System.out.println("Elementy w secie");
        System.out.println(MustangBaseFactory.getFordMustangBaseSet().size());
        MustangBaseFactory.getFordMustangBaseSet()
                .stream()
                .forEach(x -> System.out.println(x.getEngine() + " " + x.getColor()));
    }
}
