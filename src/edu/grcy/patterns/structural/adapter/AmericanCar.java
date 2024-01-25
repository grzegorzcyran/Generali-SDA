package edu.grcy.patterns.structural.adapter;

public abstract class AmericanCar implements AmericanMovable {
	double speed;

	//metoda adaptująca (przeliczająca domyślną prędkość MPH na KMH)
	public double getSpeedKMH() {
		return speed *
				SpeedConverter.MILES_TO_KILOMETERS.getConverter();
	}
}
