package Inheritance;

public class Vehicle {
    private String brand;
    private int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }


    public void setYear(int year) {
        if (year >= 1886 && year <= 2025) {
            this.year = year;
        } else {
            System.out.println("Invalid year! Year must be between 1886 and 2025.");
        }
    }

    // Method to be overridden
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    // Common method
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}


