package edu.grcy.patterns.creational.abstractFactory;

public class FordOrdersPoint {

	public static Ford orderNewFord(FordAbstractFactory factory){
		return factory.createFord();
	}
}
