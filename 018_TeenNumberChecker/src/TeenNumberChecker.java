public class TeenNumberChecker {
    // We'll say a number is "teen" if it is in range 13-19 (inclusive).
    // Write a method named hasTeen with 3 parameters of type int
    public static boolean hasTeen(int number1, int number2, int number3) {
        return isTeen(number1) || isTeen(number2) || isTeen(number3);
    }
    // Write another method named isTeen with 1 parameter of type int.
    // The method should return boolean and it needs to return true if the parameter is in range [13,19]
    public static boolean isTeen(int number) {
        return (number >= 13) && (number <= 19);
    }
}
