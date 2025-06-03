package Abstraction;

public interface Drawable {
    void draw();

    default void displayInfo() {
        System.out.println("This object can be drawn.");
    }
}
