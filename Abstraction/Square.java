package Abstraction;
import Abstraction.Drawable;

public class Square extends Shape implements Drawable{
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " square with side " + side);
    }
}
