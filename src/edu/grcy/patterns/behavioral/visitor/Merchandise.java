package edu.grcy.patterns.behavioral.visitor;

public interface Merchandise {

	int accept(Calculator visitor);
}
