import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        while (true) {

            System.out.println("Enter number");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();
                if (number < minimum) {
                    minimum = number;
                }
                if (number > maximum) {
                    maximum = number;
                }

            } else {
                System.out.println("Maximum: " + maximum + " Minimum: " + minimum);
                break;
            }
            // Read the numbers from the console entered by a user and print the minimum and maximum numbers the user has entered
            // Before the user enters the number, print the message "Enter number"
            // If the user enters an invalid number break out of the loop and print the minimum and maximum number
        }
        scanner.close();
    }
}
