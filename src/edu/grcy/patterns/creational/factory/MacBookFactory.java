package edu.grcy.patterns.creational.factory;

public class MacBookFactory {

	public static MacBook getMacBook(String type, String memory, String disc, int screenSize){

		//fabryka jest ok jeśli mamy stałą, niezmienną liczbę klas
		//dla których będziemy tworzyć obiekty
		if("Air".equalsIgnoreCase(type))
			return new MacBookAir(memory, disc, screenSize);
		else if("Pro".equalsIgnoreCase(type))
			return new MacBookPro(memory, disc, screenSize);

		return null;
	}
}

