public class Break {
    public static void main(String[] args) {
        // 1. Break
        // Sử dụng break để thoát vòng lặp for khi gặp điều kiện
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Thoát vòng lặp khi i = 5
            }
            System.out.println("Break - Number: " + i);
        }

        // Break trong while loop
        int count = 0;
        while (count < 10) {
            count++;
            if (count == 7) {
                break; // Thoát khi count = 7
            }
            System.out.println("Break - Count: " + count);
        }

        // 2. Continue
        // Sử dụng continue để bỏ qua lần lặp hiện tại khi gặp điều kiện
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Bỏ qua khi i = 3, tiếp tục vòng lặp
            }
            System.out.println("Continue - Number: " + i);
        }

        // Continue trong while loop
        int num = 0;
        while (num < 5) {
            num++;
            if (num == 2) {
                continue; // Bỏ qua khi num = 2
            }
            System.out.println("Continue - Number: " + num);
        }
    }
}