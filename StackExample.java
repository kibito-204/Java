package abc;
import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Phần tử trên cùng: " + stack.peek());

        while (!stack.empty()) {
            System.out.println("Lấy ra: " + stack.pop());
        }
    }
}
