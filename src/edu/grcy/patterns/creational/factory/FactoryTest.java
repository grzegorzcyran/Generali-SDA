package edu.grcy.patterns.creational.factory;

public class FactoryTest {
    public static void main(String[] args) {

        //Fabryka jest po to żeby nie robić wywołań jak poniżej
        //MacBook macBook = new MacBookAir()

        //Jak mamy fabrykę obiektów to robimy to następująco:
        MacBook macBookAir1 = MacBookFactory.getMacBook("Air", "64GB", "256", 13);
        MacBook macBookPro1 = MacBookFactory.getMacBook("Pro", "512GB", "1TB", 16);

        MacBook nonExisting = MacBookFactory.getMacBook("Other", "1TB", "4TB", 22);

        /**
         * Fabryki używamy jeśli obiekty są na tyle podobne
         * że ich konstruktory przyjmują tą samą listę paramentrów.
         *
         * Fabryki używamy jeśli lista typów obiektów będzie stała -
         * nie będzie się rozrastać / zmieniać.
         * Jeśli lista typów się zmienia - łamiemy OCP
         */
    }
}
