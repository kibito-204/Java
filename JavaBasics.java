public class JavaBasics{
    public static void main(String[] args) {
        // 1. Operator
        int a = 10, b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Toán tử so sánh
        boolean isEqual = (a == b);
        boolean isGreater = (a > b);
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Greater: " + isGreater);

        // Toán tử logic
        boolean x = true, y = false;
        boolean andResult = x && y; // AND
        boolean orResult = x || y; // OR
        System.out.println("AND Result: " + andResult);
        System.out.println("OR Result: " + orResult);

        // 2. String
        String firstName = "Kyanh";
        String lastName = "Hoang";

        // Nối chuỗi
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Một số phương thức String
        System.out.println("Length of Full Name: " + fullName.length());
        System.out.println("Uppercase: " + fullName.toUpperCase());
        System.out.println("Substring (0,5): " + fullName.substring(0, 5));
        System.out.println("Contains 'Kyanh': " + fullName.contains("Kyanh"));

        // 3. Math
        double num1 = 16.0, num2 = -9.5;

        // Một số phương thức của Math
        System.out.println("Square root of " + num1 + ": " + Math.sqrt(num1));
        System.out.println("Absolute value of " + num2 + ": " + Math.abs(num2));
        System.out.println("Power (2^3): " + Math.pow(2, 3));
        System.out.println("Max of " + a + " and " + b + ": " + Math.max(a, b));
        System.out.println("Round " + num2 + ": " + Math.round(num2));
        System.out.println("Random number (0-1): " + Math.random());

        // 4. Boolean
        boolean isAdult = true;
        boolean hasLicense = false;

        if (isAdult && hasLicense) {
            System.out.println("You can drive.");
        } else {
            System.out.println("You cannot drive.");
        }

        // Toán tử logic với Boolean
        boolean canVote = isAdult || hasLicense;
        System.out.println("Can vote: " + canVote);

        // Chuyển đổi Boolean thành String
        String boolString = String.valueOf(isAdult);
        System.out.println("Boolean as String: " + boolString);
    }
}