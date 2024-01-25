package edu.grcy.patterns.structural.flyweight;

public class FordMustang {
    private FordMustangBase mustangBase;
    private String radio;

    public FordMustang(String color, String engine, String radio) {
        System.out.println(this.getClass() + " constructor");
        this.mustangBase = MustangBaseFactory.getMustangBase(color, engine);
        this.radio = radio;
    }

    public String carInfo() {
        return "Ford Mustang: kolor: " + mustangBase.getColor() +
                ", silnik: " + mustangBase.getEngine() +
                "radio: " +radio;
    }
}
