package Abstraction;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double getArea();

    abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    public void describe() {
        System.out.println("This is a " + color + " shape.");
    }
}
