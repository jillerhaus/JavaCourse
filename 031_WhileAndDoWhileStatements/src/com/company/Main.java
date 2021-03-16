package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        while(count != 5) {
            System.out.println(String.format("Count value is %d", count));
            count++;
        }
        // equivalent for statement
        System.out.println("Same thing with a for statement");
        for(int i = 0; i != 5; i++) {
            System.out.println(String.format("Count value is %d", i));
        }

        // Another, more stupid way of doing the same stupid thing
        count = 0;
        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 0;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count < 7);

        int number = 4;
        int finishNumber = 20;

        while(number <= 20) {
            System.out.println(String.format("%d is %san even number", number, isEven(number) ? "" : "not "));
            number++;
        }

        number = 4;

        while (number <= finishNumber) {
            number ++;
            if(!isEven(number)) {
                continue;
            }
            System.out.println("Even number " + number );
        }

        /*
         Modify the while code above
         Make it also record the total number of even numbers it has found
         and break once 5 are found
         and at the end, display the total number of even numbers are found
        */

        number = 4;
        int foundEvens = 0;
        while (number <= finishNumber) {
            number++;
            if(!isEven(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            foundEvens += 1;
            if (foundEvens >= 5) {
                break;
            }
        }
        System.out.println("Evens found: " + foundEvens);

    }
    // Create a method called isEven number that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is an even number
    // return true if an even number, otherwise return false

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
