public class PerfectNumber {
    // write a method called isPerfectNumber, with one parameter of type int
    public static boolean isPerfectNumber(int number) {

        // if the number is < 1 the method should return false
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i<number; i++) {
            if (number % i == 0) {
                sum += i;
            }

        }
        return (sum == number);
    }
}
