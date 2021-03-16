public class NumberToWords {
    // Write a method called numberToWords with one int parameter named number
    public static void numberToWords(int number) {
        // If the number is negative print "invalid value"
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        }
        //To print the number as words, follow the steps
        // 1. Extract the last digit of the given number using the remainder operation
        // 2. Convert that value into a word
        // 3. Remove the last digit from the number
        // 4. Repeat steps 2-4 until the number is 0.
        int workingNumber = reverse(number);
        while (workingNumber > 0) {
            int lastDigit = workingNumber % 10;
            String word = "";
            switch (lastDigit) {
                case 0: {
                    word = "Zero";
                    break;
                }
                case 1: {
                    word = "One";
                    break;
                } case 2: {
                    word = "Two";
                    break;
                } case 3: {
                    word = "Three";
                    break;
                } case 4: {
                    word = "Four";
                    break;
                } case 5: {
                    word = "Five";
                    break;
                } case 6: {
                    word = "Six";
                    break;
                } case 7: {
                    word = "Seven";
                    break;
                } case 8: {
                    word = "Eight";
                    break;
                } case 9: {
                    word = "Nine";
                    break;
                } default: {
                    word = "Unknown";
                }
            }
            workingNumber /= 10;
            System.out.println(word);
        }
        int trailingZeroes =getDigitCount(number) - getDigitCount(reverse(number));
        for (int i = 0; i < trailingZeroes; i++) {
            System.out.println("Zero");
        }

    }

    // Write a second method called reverse. Has one int parameter and returns the inverted number
    public static int reverse(int number) {
        int workingNumber = Math.abs(number);
        int reversedNumber = 0;
        while (workingNumber > 0) {
            reversedNumber += workingNumber % 10;
            reversedNumber *= 10;
            workingNumber /= 10;
        }
        reversedNumber /= 10;
        return (int) Math.signum(number) * reversedNumber;
    }

    // Write a third method called getDigitCount. Has one int parameter called number
    public static int getDigitCount(int number) {
        // if the number is negative return -1
        if (number < 0) {
             return -1;
        }
        int digitCount = 0;
        int workingNumber = number;
        while (workingNumber >= 10) {
            digitCount++;
            workingNumber /= 10;
        }
        return digitCount + 1;
    }
}
