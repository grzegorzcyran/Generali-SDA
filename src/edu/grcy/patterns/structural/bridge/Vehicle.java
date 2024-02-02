package edu.grcy.patterns.structural.bridge;
// Java code to demonstrate
// bridge design pattern

import java.util.Arrays;
import java.util.List;

// abstraction in bridge pattern
abstract class Vehicle {
	protected List<Workshop> workShops;

	protected Vehicle(List<Workshop> workShops)
	{
		this.workShops = workShops;
	}

	public abstract void manufacture();
}

// Refine abstraction 1 in bridge pattern
class Car extends Vehicle {
	public Car(List<Workshop> workShops)
	{
		super(workShops);
	}

	@Override
	public void manufacture()
	{
		System.out.print("Car ");
		workShops.forEach(Workshop::work);
	}
}

// Refine abstraction 2 in bridge pattern
class Bike extends Vehicle {
	public Bike(List<Workshop> workShops)
	{
		super(workShops);
	}

	@Override
	public void manufacture()
	{
		System.out.print("Bike ");
		workShops.forEach(Workshop::work);
	}
}

// Implementor for bridge pattern
interface Workshop
{
	 void work();
}

// Concrete implementation 1 for bridge pattern
class Produce implements Workshop {
	@Override
	public void work()
	{
		System.out.print("Produced");
	}
}

// Concrete implementation 2 for bridge pattern
class Assemble implements Workshop {
	@Override
	public void work()
	{
		System.out.print(" And");
		System.out.println(" Assembled");
	}
}

class Paint implements  Workshop {
	@Override
	public void work() {
		System.out.print(" And");
		System.out.println(" Painted");
	}
}

// Demonstration of bridge design pattern
class BridgePattern {
	public static void main(String[] args)
	{
		List<Workshop> carWorkshops = Arrays.asList(new Produce(), new Assemble(), new Paint());
		Vehicle vehicle1 = new Car(carWorkshops);
		vehicle1.manufacture();
		System.out.println("=====================");
		List<Workshop> bikeWorkshops = Arrays.asList(new Produce(), new Assemble());
		Vehicle vehicle2 = new Bike(bikeWorkshops);
		vehicle2.manufacture();
	}
}