public class GreatestCommonDivisor {
    // Write a method named getGreatestCommonDivisor with two parameters of type int named first and second
    public static int getGreatestCommonDivisor(int first, int second) {
        // if one of the parameters is < 10 it should return -1
        if ((first < 10) || (second < 10)) {
            return -1;
        } else {

            // The method should return the greatest common divisor of the two numbers
            for (int i = first; i > 0; i--) {
                if ((first % i == 0) && (second % i == 0)) {
                    return i;
                }
            }

            return -2;
        }

    }
}
