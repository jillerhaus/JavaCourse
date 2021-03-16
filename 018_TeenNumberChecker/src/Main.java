public class Main {
    public static void main(String[] args) {
        testHasTeen(9,99,19);
        testHasTeen(23,15,42);
        testHasTeen(22,23,34);


    }
    public static void testHasTeen(int number1, int number2, int number3) {
        System.out.println(String.format("(%d,%d,%d) has a teen number? %b", number1, number2, number3, TeenNumberChecker.hasTeen(number1, number2, number3)));
    }
}
