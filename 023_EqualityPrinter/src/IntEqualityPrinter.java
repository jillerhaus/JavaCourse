public class IntEqualityPrinter {

    // Write a method printEqual with 3 parameters of type int.
    // The method should not return anything
    public static void printEqual(int number1, int number2, int number3) {
        // if one of the parameters is less than 0 print text "Invalid Value"
        if ((number1 < 0) || (number2 < 0) || (number3 < 0)) {
            System.out.println("Invalid Value");
        } else {
            if ((number1 == number2) && (number1 == number3)) {
                System.out.println("All numbers are equal");
            } else if ((number1 == number2) || (number1 == number3) || (number2 == number3)) {
                System.out.println("Neither all are equal or different");
            }
            else {
                System.out.println("All numbers are different");
            }
        }
    }
}
