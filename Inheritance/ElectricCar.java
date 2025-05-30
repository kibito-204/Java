package Inheritance;

public class ElectricCar extends Car {
    private int batteryCapacity;

    // Constructor
    public ElectricCar(String brand, int year, int numDoors, int batteryCapacity) {
        super(brand, year, numDoors); // Call parent (Car) constructor
        this.batteryCapacity = batteryCapacity;
    }


    public void setBatteryCapacity(int batteryCapacity) {
        if (batteryCapacity > 0) {
            this.batteryCapacity = batteryCapacity;
        } else {
            System.out.println("Invalid battery capacity! Must be greater than 0.");
        }
    }

    // Override start method
    @Override
    public void start() {
        System.out.println("Electric car is starting silently with electric power!");
    }

    // Override displayInfo to include electric car-specific info
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent (Car) method
        System.out.println("Battery Capacity: " +-batteryCapacity + " kWh");
    }
}