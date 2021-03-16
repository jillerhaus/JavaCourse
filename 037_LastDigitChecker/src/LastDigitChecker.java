public class LastDigitChecker {
    // Write a method called hasSameLastDigit with three parameters fo type int
    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        // Each number should be in [10,1000] else return false
        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
            return false;
        } else {
            int digit1 = number1 % 10;
            int digit2 = number2 % 10;
            int digit3 = number3 % 10;
            return ((digit1 == digit2 ) || (digit1 == digit3) || (digit2 == digit3));
        }
    }
    // Write another method called isValid with one parameter of type int
    public static boolean isValid(int number) {
        // The method needs to return true if the parameter is in [10, 1000]
        return ((number >= 10) && (number <= 1000));
    }
}
