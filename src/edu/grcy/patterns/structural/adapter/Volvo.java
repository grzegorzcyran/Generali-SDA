package edu.grcy.patterns.structural.adapter;

public class Volvo extends EuropeanCar {

	String name;

	public Volvo(String name, double speed) {
		this.name = name;
		this.speed = speed;
	}

	@Override
	public double getSpeed() {
		return speed;
	}

	public String getName() {
		return name;
	}
}
