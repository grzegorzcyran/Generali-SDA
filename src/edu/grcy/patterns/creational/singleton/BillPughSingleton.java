package edu.grcy.patterns.creational.singleton;

public class BillPughSingleton {

	private BillPughSingleton() {
		System.out.println("Object initialisation");
	}

	private static class SingletonHelper {

		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		System.out.println("Get instance");
		return SingletonHelper.INSTANCE;
	}
}
