package edu.grcy.patterns.structural.decorator;

public class BasicCar implements Car {

	@Override
	public void assemble() {
		System.out.println("Assemble of Basic Car.");
	}
}
