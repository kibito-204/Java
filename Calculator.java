package Functional_Interface;
@FunctionalInterface
interface Calculator {
    int operate(int a, int b);

    // Bạn có thể có phương thức mặc định hoặc static (không ảnh hưởng)
    default void showInfo() {
        System.out.println("Đây là functional interface Calculator");
    }

    static void welcome() {
        System.out.println("Chào mừng đến với Java!");
    }
}
