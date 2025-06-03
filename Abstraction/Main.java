package Abstraction;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Red", 5.0));
        shapes.add(new Rectangle("Blue", 4.0, 6.0));
        shapes.add(new Square("Green", 3.0));

        for (Shape shape : shapes) {
            shape.describe();
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());

            if (shape instanceof Drawable) {
                ((Drawable) shape).draw();
                ((Drawable) shape).displayInfo();
            }
            System.out.println();
        }
    }
}
