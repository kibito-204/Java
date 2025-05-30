public class Condition {
    public static void main(String[] args) {
        // 1. If/Else
        int temperature = 25;

        if (temperature > 30) {
            System.out.println("It's hot outside!");
        } else if (temperature >= 20) {
            System.out.println("It's warm outside.");
        } else {
            System.out.println("It's cold outside.");
        }

        // If lồng nhau
        boolean isRaining = false;
        if (temperature >= 20) {
            if (!isRaining) {
                System.out.println("You can go outside without an umbrella.");
            } else {
                System.out.println("Bring an umbrella!");
            }
        }

        // 2. Switch/Case
        int month = 4; // 1 = January, 2 = February, ..., 12 = December

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            default:
                System.out.println("Month not specified in this example.");
                break;
        }

        // Switch/Case với String
        String season = "Summer";
        switch (season) {
            case "Summer":
                System.out.println("It's hot and sunny!");
                break;
            case "Winter":
                System.out.println("It's cold and snowy!");
                break;
            default:
                System.out.println("Season not specified.");
                break;
        }

        // 3. Ternary Operator
        int score = 75;

        // Sử dụng Ternary Operator
        String grade = (score >= 80) ? "Excellent" : "Needs Improvement";
        System.out.println("Score " + score + ": " + grade);

        // Ternary lồng nhau
        String weather = (temperature >= 20) ? "Warm" : (temperature >= 10) ? "Cool" : "Cold";
        System.out.println("Weather: " + weather);

        // Ternary với boolean
        String rainAdvice = (isRaining) ? "Bring an umbrella" : "No umbrella needed";
        System.out.println("Rain Advice: " + rainAdvice);
        int ab = 8;
        int ky = (ab<9) ? 2:4;
        System.out.println(ky);
    }
}