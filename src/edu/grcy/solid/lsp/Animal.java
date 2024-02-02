package edu.grcy.solid.lsp;

public abstract class Animal {
    public abstract void eat();
}

abstract class Snake extends Animal {
    public abstract void creep();
}

abstract class Bird extends Animal {
    public abstract void fly();
}

class Duck extends Bird {
    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void eat() {

    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }

    @Override
    public void eat() {

    }
}