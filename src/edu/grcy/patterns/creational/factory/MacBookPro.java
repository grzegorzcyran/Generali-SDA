package edu.grcy.patterns.creational.factory;

public class MacBookPro extends MacBook {

	private String memory;
	private String disc;
	private int screenSize;

	public MacBookPro(String memory, String disc, int screenSize) {
		this.memory = memory;
		this.disc = disc;
		this.screenSize = screenSize;
	}

	@Override
	public String getMemory() {
		return memory;
	}

	@Override
	public String getDisk() {
		return disc;
	}

	@Override
	public int getScreenSize() {
		return screenSize;
	}
}
