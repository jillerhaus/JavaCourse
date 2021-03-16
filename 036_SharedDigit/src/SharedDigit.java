public class SharedDigit {
    // Write a method named hasSharedDigit with two parameters fo type int
    // should return a boolean
    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 < 10) || (number1 > 99) || (number2 < 10) || (number2 > 99)) {
            return false;
        } else {
            int workingNumber1 = number1;

            while (workingNumber1 > 0) {
                int workingNumber2 = number2;
                int currentDigit1 = workingNumber1 % 10;
                System.out.println("currently working with digit " + currentDigit1 + " from number 1: " + number1);
                workingNumber1 /= 10;
                while (workingNumber2 > 0) {
                    int currentDigit2 = workingNumber2 % 10;
                    System.out.println("comparing against digit " + currentDigit2 + " from number 2: " + number2);
                    workingNumber2 /= 10;
                    if (currentDigit1 == currentDigit2) {
                        return true;
                    }

                }
            }
        }
        return false;
    }
}
