package edu.grcy.patterns.behavioral.visitor;

public class Fridge implements Merchandise {

	private int commonValue;
	private int itemValue;
	private String name;

	public Fridge(int commonValue, int itemValue, String name){
		this.commonValue =commonValue;
		this.itemValue=itemValue;
		this.name = name;
	}

	@Override
	public int accept(Calculator visitor) {

		return visitor.calculate(this);
	}

	public int getCommonValue() {
		return commonValue;
	}

	public int getItemValue() {
		return itemValue;
	}

	public String getName(){
		return this.name;
	}



}
