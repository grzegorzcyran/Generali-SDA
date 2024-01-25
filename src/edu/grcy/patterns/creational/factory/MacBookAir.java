package edu.grcy.patterns.creational.factory;

public class MacBookAir extends MacBook {

	private String memory;
	private String disk;
	private int screenSize;

	public MacBookAir(String name, String par1, int par2) {
		this.memory = name;
		this.disk = par1;
		this.screenSize = par2;
	}

	@Override
	public String getMemory() {
		return memory;
	}

	@Override
	public String getDisk() {
		return disk;
	}

	@Override
	public int getScreenSize() {
		return screenSize;
	}
}
