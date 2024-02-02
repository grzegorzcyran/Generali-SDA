package edu.grcy.patterns.behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {
        GameState state = new GameState(1, "Biały Sad");

        GameStateMemento mementoBialySad = state.saveGame();
        System.out.println(state);
        state.changeGameState(2, "Velen");
        System.out.println(state);
        GameStateMemento mementoVelen = state.saveGame();
        state.changeGameState(3, "Novigrad");

        System.out.println(state);
        System.out.println("=============");
        state.restore(mementoBialySad);
        System.out.println(state);
        System.out.println("==============");
        state.restore(mementoVelen);
        System.out.println(state);

    }
}
