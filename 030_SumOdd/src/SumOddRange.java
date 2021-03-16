public class SumOddRange {

    // write a method called isOdd with an int parameter and call it number. The method needs to return a boolean
    public static boolean isOdd(int number) {
        // Check that the number is > 0, if it is not return false
        // if the number is odd return true, otherwise return false
        if ((number % 2 != 0) && (number > 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Write a second method called sumOdd that has 2 int parameters start and end, which represent [start,end]
    // The method should use a for loop to sum up all odd numbers in the range and return the sum
    public static int sumOdd(int start, int end) {

        // The parameter end needs to be greater than or equal to start and both need to be greater than 0
        if ((start > end) || (start <= 0)) {
            // if those conditions are not satisfied return -1 from the method to indicate an invalid input
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {



            // It should call the method isOdd to check if each number is odd.
            if (isOdd(i)) {
                sum += i;

            }
        }

        return sum;
    }
}
