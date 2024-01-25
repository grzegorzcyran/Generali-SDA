package edu.grcy.patterns.creational.singleton;

//Lazy czyli "inicjowanie przy pierwszym użyciu"
public class LazySingleton {

	private static LazySingleton instance;

	private LazySingleton(){
		System.out.println("Lazy Singleton initialization");
	}

	public static LazySingleton getInstance(){
		//przy pierwszym wywołaniu getInstance() nastąpi utworzenie obiektu przez konstruktor
		if (instance == null){
			/**
			 * Lazy Singleton nie powinien być używany w aplikacjach
			 * wielowątkowych bo kilka wątków może utworzyć odrębne instancje klasy
			 */
			instance = new LazySingleton();
		}
		return instance;
	}

}
