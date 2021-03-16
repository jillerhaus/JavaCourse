public class Main {
    public static void main(String[] args) {
        testEqualSum(1,1,1);
        testEqualSum(1,1,2);
        testEqualSum(1, -1,0);

    }
    public static void testEqualSum(int number1, int number2, int inputSum) {
        System.out.println(number1 + " + " + number2 + " = " + inputSum + " ? " + EqualSumChecker.hasEqualSum(number1, number2, inputSum));
    }
}
