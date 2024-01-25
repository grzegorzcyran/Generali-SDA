package edu.grcy.patterns.structural.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        //zwykły prosty samochód bez dodatków
        Car basicCar = new BasicCar();
        basicCar.assemble();
        System.out.println("=========================");

        Car basicCar2 = new BasicCar();
        SportPackage sportCar = new SportPackage(basicCar2, true);
        sportCar.assemble();
        System.out.println("=========================");

        Car basicCar3 = new BasicCar();
        WinterPackage winterCar = new WinterPackage(basicCar3, false, true);
        SportPackage sportCar2 = new SportPackage(winterCar, false);
        sportCar2.assemble();
        System.out.println("=========================");

        WinterPackage winterCar2 = new WinterPackage(new SportPackage(new BasicCar(), true), true, false);
        winterCar2.assemble();
        System.out.println("=========================");


    }
}
