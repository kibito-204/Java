public class Array {
    public static void main(String[] args) {
        // 1. Khai báo và khởi tạo mảng
        int[] numbers = new int[5]; // Mảng số nguyên với 5 phần tử, giá trị mặc định là 0
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 2. Khởi tạo mảng với giá trị cụ thể
        int[] scores = {90, 85, 95, 70, 88}; // Mảng số nguyên với giá trị ban đầu
        System.out.println("\nMảng scores:");
        for (int score : scores) { // Sử dụng enhanced for loop
            System.out.print(score + " ");
        }
        System.out.println();

        // 3. Truy cập và sửa đổi phần tử
        System.out.println("Giá trị tại chỉ số 2 của scores: " + scores[2]); // Truy cập phần tử
        scores[2] = 100; // Sửa đổi phần tử tại chỉ số 2
        System.out.println("Sau khi sửa đổi scores[2]: " + scores[2]);

        // 4. Một số phương thức của mảng
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("Tổng các phần tử trong scores: " + sum);
        System.out.println("Số phần tử trong scores: " + scores.length);
        System.out.println("Phần tử lớn nhất: " + findMax(scores)); // Gọi phương thức tìm max

        // 5. Mảng đa chiều (2D Array)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Ma trận 3x3:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 6. Xử lý ngoại lệ (ArrayIndexOutOfBoundsException)
        try {
            System.out.println("Thử truy cập chỉ số 10 (không tồn tại): " + scores[4]);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    // Phương thức tìm giá trị lớn nhất trong mảng
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}