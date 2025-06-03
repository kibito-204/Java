package abc;

import java.util.*;

public class Queueexp {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Phần tử đầu hàng đợi: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("Lấy ra: " + queue.poll());
        }
    }
}
