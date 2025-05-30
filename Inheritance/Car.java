package Inheritance;

public class Car extends Vehicle {
    private int numDoors;

    // Constructor
    public Car(String brand, int year, int numDoors) {
        super(brand, year); // Call parent constructor
        this.numDoors = numDoors;
    }
    public void setNumDoors(int numDoors) {
        if (numDoors > 0) {
            this.numDoors = numDoors;
        } else {
            System.out.println("Invalid number of doors! Must be greater than 0.");
        }
    }

    // Override start method
    @Override
    public void start() {
        System.out.println("Car engine is starting with a roar!");
    }

    // Override displayInfo to include car-specific info
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Number of doors: " + numDoors);
    }
}
