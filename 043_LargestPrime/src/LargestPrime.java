public class LargestPrime {
    // Write a method named getLargestPrime with one parameter of type int
    public static int getLargestPrime(int number) {
        // if the number is negative or does not have any prime number, the method should return -1 to indicate an invalid value
        // The method should return the larges prime factor of a given number and return it

        if (number < 2) {
            return -1;
        }

        for(int i = number; i >= 1; i--) {
            if (number % i == 0) {
                if(isPrime(i)) {
                    return i;
                }
            }
        }
        return -1;


    }


    public static boolean isPrime (int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

