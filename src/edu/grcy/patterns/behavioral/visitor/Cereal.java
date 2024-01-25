package edu.grcy.patterns.behavioral.visitor;

public class Cereal implements Merchandise {
    private String name;
    private float weight;
    private int price;

    public Cereal(String name, float weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int accept(Calculator visitor) {
        return visitor.calculate(this);
    }
}
