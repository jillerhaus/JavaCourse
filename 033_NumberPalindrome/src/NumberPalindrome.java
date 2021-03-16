public class NumberPalindrome {
    // Write a method called isPalindrome with one int parameter called number
    // The method needs to return a boolean
    public static boolean isPalindrome(int number) {
        // It should return true if the number is a palindrome
        number = Math.abs(number);
        int numberLength = 0;
        int workingNumber = number;
        while (workingNumber >= 10) {
            workingNumber /= 10;
            numberLength += 1;
        }
        System.out.println(numberLength);

        workingNumber = number;

        for(int i = 0; i < (numberLength / 2) +1; i++) {
            int trailingNumber = (int) (workingNumber % Math.pow(10, 1 + i) / Math.pow(10,i));
            int leadingNumber = (int) (workingNumber / Math.pow(10, numberLength - i));
            workingNumber -= leadingNumber * Math.pow(10, numberLength - i);
            if (trailingNumber != leadingNumber) {
                return false;
            }
        }


        return true;
    }

    // alternative solution
    public static boolean isPalindrome(long number) {
        number = Math.abs(number);

        int reverseNumber = 0;
        int workingNumber = (int) number;
        int digit = 1;
        while (workingNumber > 0) {
            reverseNumber += (workingNumber % 10);
            reverseNumber *= 10;
            workingNumber /= 10;
            System.out.println(workingNumber);
            System.out.println(reverseNumber);
        }
        reverseNumber /= 10;
        return reverseNumber == number;

    }
}
