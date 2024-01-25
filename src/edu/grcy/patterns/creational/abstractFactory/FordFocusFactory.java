package edu.grcy.patterns.creational.abstractFactory;

public class FordFocusFactory implements FordAbstractFactory {
	private String name;
	private String engine;
	private String addons;

	public FordFocusFactory(String name, String engine, String addons) {
		this.name = name;
		this.engine = engine;
		this.addons = addons;
	}

	@Override
	public Ford createFord() {
		return new FordFocus(name, engine, addons);
	}

}
