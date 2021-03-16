public class Main {
    public static void main(String[] args) {
        testDecimalComparator(-3.1756, -3.175);
        testDecimalComparator(3.175, 3.176);
        testDecimalComparator(3.0, 3.0);
        testDecimalComparator(-3.123, 3.123);

    }
    public static void testDecimalComparator(double number1, double number2) {
        System.out.println(number1 + " & " + number2 + " ->" + DecimalComparator.areEqualByThreeDecimalPlaces(number1, number2));
    }
}
