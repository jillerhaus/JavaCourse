public class Main {
    public static void main(String[] args) {
        System.out.println(51 / 10);
        System.out.println(sumDigits(69420));
        System.out.println(sumDigits(-69420));
        System.out.println(sumDigits(-6 ));

    }
    /*
    Write a method with the name sumDigits that has one int parameter called number
    If parameter is >= 10 then the method should process the number and return sum of all digits,
    otherwise return -1 to indicate an invalid value.
    The numbers from 0-9 have 1 digit so we don't want to process them, also we don't want to
    process negative numbers, so also return -1 for negative numbers
    for example sumDigits(125) should return 8 since 1 + 2 + 5 = 8
    */
    private static int sumDigits (int number) {
        if (number < 10) {
            return -1;
        } else {
            int digitSum =  0;
            int workingNumber = number;
            while (workingNumber > 0){
                digitSum += workingNumber % 10;
                workingNumber /= 10;

            }
            return digitSum;
        }
    }
}
