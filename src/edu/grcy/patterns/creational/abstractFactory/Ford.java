package edu.grcy.patterns.creational.abstractFactory;

public abstract class Ford {

	public abstract String getName();
	public abstract String getEngine();
	public abstract String getAddons();

	@Override
	public String toString(){
		return "Name="+this.getName()+", getEngine="+this.getEngine()+", getAddons="+this.getAddons();
	}
}
