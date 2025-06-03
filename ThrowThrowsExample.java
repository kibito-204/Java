public class ThrowThrowsExample {

    // Phương thức khai báo có thể ném ngoại lệ
    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Tuổi phải >= 18");
        }
        System.out.println("Đủ tuổi!");
    }

    public static void main(String[] args) {
        try {
            checkAge(1);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
