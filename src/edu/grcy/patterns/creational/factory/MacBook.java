package edu.grcy.patterns.creational.factory;

public abstract class MacBook {

	public abstract String getMemory();
	public abstract String getDisk();
	public abstract int getScreenSize();

	@Override
	public String toString(){
		return "Name= "+this.getMemory()+", Par1="+this.getDisk()+", Par2="+this.getScreenSize();
	}
}
