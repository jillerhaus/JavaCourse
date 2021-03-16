import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int correctNumbers = 0;

        // Read 10 numbers from the console entered by the user and print the sum of those numbers.
        // create a Scanner instance like we did in the previous video
        Scanner scanner = new Scanner(System.in);

        while (correctNumbers < 10) {


            // Use the hasNextInt() method from the scanner to check if the user has entered an int value
            // Before the user enters each number, print the message "Enter number #x:"
            // For example the first message printed should be "Enter number +1:"
            System.out.println(String.format("Enter number #%d:", correctNumbers + 1));
            boolean hasNextInt = scanner.hasNextInt();
            // If hasNextInt is false, print  message "Invalid Number". Continue reading until you have read 10 numbers
            if (!hasNextInt) {
                System.out.println("Invalid Number");
            } else {
                // Use the nextInt() method to get the number and add it to the sum
                int number = scanner.nextInt();
                sum += number;
                correctNumbers += 1;
            }
            scanner.nextLine(); // handle next line (enter key)
        }
        scanner.close();
        System.out.println("The sum was: " + sum);



    }
}
