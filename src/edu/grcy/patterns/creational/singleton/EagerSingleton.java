package edu.grcy.patterns.creational.singleton;

//Eager oznacza utworzenie "od razu"
public class EagerSingleton {
	//prywatne pole klasy EagerSingleton - od razu inicjowane
	private static final EagerSingleton INSTANCE = new EagerSingleton();
	private String otherField;

	//prywatny konstruktor - czyli z zewnątrz nie utworzymy nowego obiektu *
	// * no chyba że np. REFLEKSJĄ
	private EagerSingleton(){
		System.out.println("Eager singleton initialisation");
		otherField = "aaa";
	}

	//publicza metoda wystawiająca utworzone wcześniej pole
	public static EagerSingleton getInstance(){
		System.out.println("Get instance");
		return INSTANCE;
	}

	public String getOtherField() {
		return otherField;
	}

	// ... kolejne pola i metody

}
