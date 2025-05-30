package Inheritance;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Constructor
    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year); // Call parent constructor
        this.hasSidecar = hasSidecar;
    }


    // Override start method
    @Override
    public void start() {
        System.out.println("Motorcycle engine is revving up!");
    }

    // Override displayInfo to include motorcycle-specific info
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Has sidecar: " + hasSidecar);
    }
}
