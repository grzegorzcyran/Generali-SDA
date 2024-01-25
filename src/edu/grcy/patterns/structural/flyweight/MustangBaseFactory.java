package edu.grcy.patterns.structural.flyweight;

import java.util.HashSet;
import java.util.Set;

public class MustangBaseFactory {
    //zestaw niepowtarzalnych kombinacji silnik-kolor
    private static Set<FordMustangBase> fordMustangBaseSet = new HashSet<>();

    //metoda fabryczna
    public static FordMustangBase getMustangBase(String color, String engine) {
        FordMustangBase fordMustangBase;
        System.out.println(MustangBaseFactory.class + " getMustangBase");

        if(fordMustangBaseSet.size() > 0) {
            //jeśli w zestawie coś jest to sprawdzamy czy zgadza się
            //z oczekiwaną kombinacją silnik-kolor
            System.out.println("Size > 1");

            fordMustangBase = fordMustangBaseSet.stream()
                    .filter(f -> color.equals(f.getColor()) && engine.equals(f.getEngine()))
                    .peek(s -> {System.out.println("peek" + s.getColor());})
                    //jeśli znajdziemy oczekiwaną kombinację to findAny ją zwróci
                    .findAny()
                    //jeśli nie ma oczekiwanej kombinacji to tworzymy nowy obiekt
                    .orElseGet(() -> getNew(color, engine));

        } else {
            //przy pierwszym zamówieniu zestaw kombinacji
            //jest pusty i przejdziemy tędy
            System.out.println("Size = 0");
            fordMustangBase = new FordMustangBase(color, engine);
        }
        //za każdym razem próbujemy dodać otrzymaną kombinację do zestawu
        //ale ponieważ to SET to mamy gwarancję że nie będziemy trzymać
        //wielokrotnie tego samego zestawu silnik-kolor
        fordMustangBaseSet.add(fordMustangBase);
        return fordMustangBase;
    }

    private static FordMustangBase getNew(String color, String engine){
        System.out.println("OrElse");
        return new FordMustangBase(color, engine);
    }

    public static Set<FordMustangBase> getFordMustangBaseSet() {
        return fordMustangBaseSet;
    }
}
