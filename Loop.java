public class Loop {
    public static void main(String[] args) {
        // 1. For loop
        // In các số từ 1 đến 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop - Number: " + i);
        }

        // For Loop với bước nhảy (in số chẵn từ 2 đến 10)
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("For Loop - Even Number: " + i);
        }

        // 2. While Loop
        int count = 1;
        // In các số từ 1 đến 5
        while (count <= 5) {
            System.out.println("While Loop - Count: " + count);
            count++;
        }

        // While Loop với điều kiện khác (tính tổng các số từ 1 đến 3)
        int sum = 0;
        int num = 1;
        while (num <= 3) {
            sum += num;
            System.out.println("While Loop - Sum so far: " + sum);
            num++;
        }

        // 3. Do-While Loop
        int value = 1;
        // In các số từ 1 đến 5
        do {
            System.out.println("Do-While Loop - Value: " + value);
            value++;
        } while (value <= 5);

        // Do-While Loop chạy ít nhất 1 lần (dù điều kiện sai)
        int test = 10;
        do {
            System.out.println("Do-While Loop - Test (runs at least once): " + test);
            test++;
        } while (test <= 5); // Điều kiện sai, nhưng vẫn chạy 1 lần
    }
}