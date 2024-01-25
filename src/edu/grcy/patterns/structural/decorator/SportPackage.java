package edu.grcy.patterns.structural.decorator;

public class SportPackage extends CarDecorator {
	boolean sportWheel;
	boolean sportSeats;

	public SportPackage(Car car, boolean sportSeats) {
		super(car);
		sportWheel = false;
		this.sportSeats = sportSeats;
	}

	private void addSportWheel(){
		System.out.println(", sport wheel.");
		this.sportWheel = true;
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print("Adding features of Sport package: " + (sportSeats ? " sport seats" : ""));
		addSportWheel();
	}
}
