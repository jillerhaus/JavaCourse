public class EvenDigitSum {
    // write a method called getEvenDigitSum with one parameter of type int called number
    // the method should return the sum of the even digits within the number
    public static int getEvenDigitSum(int number) {
        // if the number is negative, the method should return -1
        if (number < 0) {
            return -1;
        } else {
            int sum = 0;
            int workingNumber = number;
            while (workingNumber > 0) {
                int workingDigit = workingNumber % 10;
                if (workingDigit % 2 == 0) {
                    sum += workingDigit;
                }
                workingNumber/=10;

            }

            return sum;
        }

    }
}
