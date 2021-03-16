public class MinutesToYearsDaysCalculator {

    // Write a method printYearsAndDays with parameter of type long named minutes
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / (60 * 24 * 365);
            long days = minutes % (60 * 24 * 365) / (60 * 24);
            System.out.println(String.format("%d min = %d y and %d d", minutes, years, days));
        }
    }
}
