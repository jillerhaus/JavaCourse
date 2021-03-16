package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int value = 2;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was neither 1 nor 2");
        }

        int switchValue = 2;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;


            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3 4 or 5");
                System.out.println(String.format("actually it was a %d", switchValue));
                break;

            default:
                System.out.println("Value was not 1, 2, 3, 4 nor 5");
                break;
        }

        // Create a new char variable
        char character = 'B';
        // Create a new switch statement using char type
        switch (character) {
            // Create a switch statement testing for A, B, C, D, or E
            case 'A':
            case 'B':
            case 'C':
            case 'E':
                System.out.println(String.format("The character was %c", character));
                break;


            default:
                System.out.println("Character not found. Look for a better one");
                break;

        }

        String month = "januaRy";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "octonobember":
                System.out.println("That month does not exist, you fool!");
                break;
            default:
                System.out.println("Aint never heard of that month");
        }
        printDayOfTheWeek(6);
        printDayOfTheWeek(69);
        printDayOfTheWeek(6L);
        printDayOfTheWeek(69L);
        System.out.println(-20 % 6);
    }

    // Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day
    public static void printDayOfTheWeek(int day) {
        switch (day) {
            // Using a switch statement print "Monday", ..., "Saturday", "Sunday" if the int parameter is in [0,6]
            case 0:
                System.out.println("Monday");
                break;

            case 1:
                System.out.println("Tuesday");
                break;

            case 2:
                System.out.println("Wednesday");
                break;

            case 3:
                System.out.println("Thursday");
                break;

            case 4:
                System.out.println("Friday");
                break;

            case 5:
                System.out.println("Saturday");
                break;

            case 6:
                System.out.println("Sunday");
                break;

            default:
                // Otherwise it should print "Invalid day"
                System.out.println("Invalid Day");
                break;
        }
    }

    public static void printDayOfTheWeek(long day){
        if ((day > 6) || (day < 0)) {
            System.out.println("Invalid Day");
        } else if (day == 0) {
            System.out.println("Monday");
        } else if (day == 1) {
            System.out.println("Tuesday");
        } else if (day == 2) {
            System.out.println("Wednesday");
        } else if (day == 3) {
            System.out.println("Thursday");
        } else if (day == 4) {
            System.out.println("Friday");
        } else if (day == 5) {
            System.out.println("Saturday");
        } else if (day == 6) {
            System.out.println("Sunday");
        }
    }
}
