package edu.grcy.patterns.structural.flyweight;

class FordMustangBase {
    private String color;
    private String engine;

    public FordMustangBase(String color, String engine) {
        System.out.println(this.getClass() + " constructor + " + color + " " + engine);
        this.color = color;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

}
