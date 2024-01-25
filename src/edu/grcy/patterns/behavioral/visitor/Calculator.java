package edu.grcy.patterns.behavioral.visitor;

public interface Calculator {

	int calculate(Fridge fridge);
	int calculate(Butter butter);
	int calculate(Cereal cereal);
}
