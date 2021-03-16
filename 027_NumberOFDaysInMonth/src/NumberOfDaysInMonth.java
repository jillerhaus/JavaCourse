public class NumberOfDaysInMonth {
    // Write a method isLeapYear with a parameter of type int named year
    public static boolean isLeapYear(int year) {
        // The parameter needs to be [1,9999]
        if ((year < 1) || (year > 9999) || ((year % 4) != 0)) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    //Write another method getDaysInMonth with two parameters month and year ints
    public static int getDaysInMonth(int month, int year) {
        //If parameter month is <1 or >12 return -1
        boolean isLeapYear = isLeapYear(year);
        int numDays = 0;
        // if parameter year is outside of [1,9999] return -1
        if ((year < 1) || (year > 9999)) {
            System.out.println(-1);
            numDays = -1;
            return numDays;
        }

        switch (month) {
            case 2:
                numDays = isLeapYear ? 29 : 28;
                break;

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numDays = 31;
                break;

            case 4: case 6: case 9: case 11:
                numDays = 30;
                break;

            default:
                numDays = -1;
                break;
        }
        System.out.println(numDays);
        return numDays;
    }
}
