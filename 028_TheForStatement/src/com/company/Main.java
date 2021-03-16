package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(String.format("10,000 at 2 percent interest = %.2f", calculateInterest(10_000,2)));

        for (int i = 0; i < 5; i++) {
            System.out.println(String.format("Loop %d hello!", i));
        }

        // using the for statement, call the calculateInterest method with 1000
        // and interest rate [2,8]
        // print results

        for (int i = 2; i<=8; i++) {
            System.out.println(String.format("10,000 at %d percent interest = %.2f moneyz", i, calculateInterest(10_000,i)));

        }

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and go down to 2%
        System.out.println("****************");

        for (int i = 8; i>=2; i--) {
            System.out.println(String.format("10,000 at %d percent interest = %.2f moneyz", i, calculateInterest(10_000,i)));
        }

        // create a for statement using any range of numbers
        // determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint: Use the break; statement to exit
        int nr = 0;
        for (int i =1; nr <357948 ; i++) {
            if (isPrime(i)) {
                nr++;
                System.out.println(String.format("Number %d is a prime number. %d have been found so far", i, nr));

            }
        }

        nr = 0;
        for (int i = 69; i< 328; i++) {
            if (isPrime(i)){
                nr++;
                System.out.println(String.format("Number %d is a prime number. %d have been found so far", i, nr));
                if (nr >= 3) {
                    break;
                }

            }
        }



    }

    public static boolean isPrime(int n) {
        if (n==1) {
            return false;
        }
        for(int i = 2; i <= (long) Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
