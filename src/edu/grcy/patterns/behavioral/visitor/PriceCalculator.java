package edu.grcy.patterns.behavioral.visitor;

public class PriceCalculator implements Calculator {

	@Override
	public int calculate(Fridge fridge) {
		int cost=0;
		//apply 50$ discount
		if(fridge.getCommonValue() > 600) {
			cost = fridge.getCommonValue()-50;
		} else {
			cost = fridge.getCommonValue();
		}
		System.out.println("Fridge :: "+ fridge.getItemValue() + " cost = " + cost);
		return cost;
	}

	@Override
	public int calculate(Butter butter) {
		int cost = butter.getCommonValue();
		System.out.println(butter.getName() + " cost = " + cost);
		return cost;
	}

	@Override
	public int calculate(Cereal cereal) {
		Float cost = cereal.getWeight() * cereal.getPrice();

		System.out.println(cereal.getName() + " cost = " + cost);
		return Math.round(cost);
	}
}
