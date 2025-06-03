package Functional_Interface;

public class FunctionalInterfaceDemo {
    public static void process(int a, int b, Calculator calc) {
        System.out.println("Kết quả: " + calc.operate(a, b));
    }

    public static void main(String[] args) {
        // 1. Dùng lambda expression
        Calculator add = (x, y) -> x + y;
        Calculator subtract = (x, y) -> x - y;

        // 2. Dùng method reference
        Calculator multiply = FunctionalInterfaceDemo::multiplyNumbers;

        // 3. Gọi qua hàm
        process(10, 5, add);        // 15
        process(10, 5, subtract);   // 5
        process(10, 5, multiply);   // 50

        // 4. Gọi default & static method
        add.showInfo();
        Calculator.welcome();
    }

    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }
}
