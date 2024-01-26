package edu.grcy.solid.ocp;

public class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.width * rectangle.height;
        } else {
            throw new IllegalArgumentException("Unknown shape");
        }
    }
}

class Circle{
    public double radius;
}

class Rectangle{
    public double width;
    public double height;
}


