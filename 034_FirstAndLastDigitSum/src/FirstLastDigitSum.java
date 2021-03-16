public class FirstLastDigitSum {
    // Write a method called sumFirstAndLastDigit with one parameter of type int called number
    public static int sumFirstAndLastDigit(int number) {
        // The method needs to find the first and last digit of the parameter number passed to the method,
        // using a loop and return the sum of the first and last digit
        // if the number is negative, the method should return -1
        if (number < 0) {
            return -1;
        }
        else{
            int sum = 0;
            int lastDigit = number % 10;
            int firstDigit = 0;

            int workingNumber = number;
            while (workingNumber > 0) {
                System.out.println("working number 1 = " + workingNumber);
                firstDigit = workingNumber % 10;
                System.out.println("first digit = " + firstDigit);
                workingNumber /= 10;
                System.out.println("working number 2 = " + workingNumber);
            }

            sum = firstDigit + lastDigit;


            return sum;
        }

    }
}
