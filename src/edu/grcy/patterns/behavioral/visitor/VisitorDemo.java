package edu.grcy.patterns.behavioral.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        int merchandiseCostSum = 0;
        Calculator priceCalc = new PriceCalculator();
        Merchandise butter = new Butter(5, 5, "Łowickie");
        Merchandise bosch = new Fridge(2000, 2000, "Bosch");
        Merchandise electrolux = new Fridge(300, 300, "Electrolux");

        merchandiseCostSum += butter.accept(priceCalc);
        merchandiseCostSum += bosch.accept(priceCalc);
        merchandiseCostSum += electrolux.accept(priceCalc);

        Cereal cereal = new Cereal("Górskie", 0.4f, 3);
        int cerealPriceRounded = cereal.accept(priceCalc);
        System.out.println("Cereal price rounded: " + cerealPriceRounded);
        merchandiseCostSum += cerealPriceRounded;
        System.out.println("======================================");
        System.out.println("\nSum calculated = " + merchandiseCostSum + "\n");
        System.out.println("======================================");
    }
}
