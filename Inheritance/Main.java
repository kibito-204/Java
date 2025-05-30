package Inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020, 4);
        car.start();
        car.displayInfo();

        Motorcycle motorcycle = new Motorcycle("Honda", 2018, true);
        motorcycle.start();
        motorcycle.displayInfo();

        ElectricCar electricCar = new ElectricCar("Tesla", 2023, 4, 75);
        electricCar.start();
        electricCar.displayInfo();

        // Test setters 
        motorcycle.setYear(2026); // Invalid year
        car.setNumDoors(2);
        electricCar.setBatteryCapacity(100);
        electricCar.displayInfo();
    }
}