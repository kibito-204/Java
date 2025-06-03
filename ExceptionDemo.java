import java.io.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        // Try-catch
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Try-with-resources
        try (FileReader fr = new FileReader("file.txt")) {
            System.out.println("Reading file...");
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}