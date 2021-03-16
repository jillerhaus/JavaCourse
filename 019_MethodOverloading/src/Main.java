public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        calculateScore(69);
        calculateScore();
        System.out.println("New score is " + newScore);

        System.out.println(calcFeetAndInchesToCentimeters(7.2, 1.2));
        System.out.println(calcFeetAndInchesToCentimeters(69));
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;

    }
    public static int calculateScore() {
        System.out.println("Unnamed player scored no points.");
        return 0;
    }

    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters.
    // Feet is the first parameter, inches is the 2nd

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        // You should validate that the first parameter feet is >= 0
        // You should validate that the second parameter inches is in [0,12]
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        } else {
            // if the parameters are valid, then calculate the value and return it
            return feet * 30.48 + inches * 2.54;
        }

    }

    // Create a second method of the same name but with only one parameter: inches
    public static double calcFeetAndInchesToCentimeters(double inches) {
        // validate that it's >=0
        if (inches < 0) {
            // return 0 if this is not true
            return -1;
        } else {
            // But if it is valid, then calculate ho many feet are in the inches
            double feet = Math.floor(inches / 12);
            double remainderInches = inches % 12;
            // call the other overloaded method passing in those feet and inches

            return calcFeetAndInchesToCentimeters(feet, remainderInches );
        }
    }
}
