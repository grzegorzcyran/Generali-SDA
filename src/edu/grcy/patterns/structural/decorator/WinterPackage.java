package edu.grcy.patterns.structural.decorator;

public class WinterPackage extends CarDecorator {

	private boolean electricMirrors;
	private boolean heatedSeats;

	public WinterPackage(Car car, boolean electricMirrors, boolean heatedSeats) {
		super(car);
		this.electricMirrors = electricMirrors;
		this.heatedSeats = heatedSeats;
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print("Adding features of winter package: ");
		System.out.print(electricMirrors ? " electric mirrors" : "");
		System.out.println(electricMirrors && heatedSeats ? "," : "");
		System.out.print(heatedSeats ? " heated seats" : "");
		System.out.println("\n");
	}

}
