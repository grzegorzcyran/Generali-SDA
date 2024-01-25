package edu.grcy.patterns.creational.abstractFactory;

public class FordFiestaFactory implements FordAbstractFactory {

	private String name;
	private String engine;
	private String addons;

	public FordFiestaFactory(String name, String engine, String addons) {
		this.name = name;
		this.engine = engine;
		this.addons = addons;
	}

	@Override
	public Ford createFord() {
		return new FordFiesta(name, engine, addons);
	}
}
