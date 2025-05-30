public class ExplicitCasting {
    public static void main(String[] args) {
        double bigNumber = 10.75;
        int smallNumber = (int) bigNumber; // Ép từ double sang int, mất phần thập phân
        System.out.println("Big Number: " + bigNumber);
        System.out.println("Small Number: " + smallNumber);
    }
}