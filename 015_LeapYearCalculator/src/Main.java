public class Main {
    public static void main(String[] args) {
        testLeapYear(4);
        testLeapYear(0);
        testLeapYear(1700);
        testLeapYear(1600);
        testLeapYear(2200);

    }
    public static void testLeapYear(int year) {
        System.out.println(year + " -> " + LeapYear.isLeapYear(year));
    }
}
