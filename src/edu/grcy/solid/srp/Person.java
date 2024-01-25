package edu.grcy.solid.srp;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     *  metoda sprawdzająca kiedy można przyznać prawo jazdy
     *  łamie SRP klasy Person bo logika sprawdzania to drugi powód do zmiany
     *  klasy Person - pierwszym jest dodanie nowych pól
     */
    public boolean canGetDrivingLicense() {
        return age >= 18;
    }

}
