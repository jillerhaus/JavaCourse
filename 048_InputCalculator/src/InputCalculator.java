import java.util.Scanner;

public class InputCalculator {
    // Write a method called inputThenPrintSumAndAverage that does not have any parameters
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        // The method should not return anything and needs to keep reading int numbers from the keyboard
        // When the user enters something that is not an int then it needs to print a message in the format
        // "SUM = XX AVG == YY"
        int sum = 0;
        int repetitions = 0;
        while (true) {

            if (!scanner.hasNextInt()) {
                if (repetitions == 0) {
                    repetitions = 1;
                }
                System.out.println("SUM = " + sum + " AVG = " + Math.round((float) sum/repetitions));
                break;
            } else {
                repetitions++;
                int number = scanner.nextInt();
                scanner.nextLine();
                sum += number;

            }
        }

        scanner.close();
    }
}
