package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if ((score < 5000) && (score > 1000)) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("You suck, boi!");
        } else {
            System.out.println("You're a genius");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // Print out a second score on the screen with the following
        // Score set to 10000
        score = 10000;
        // levelCompleted set to 8
        levelCompleted = 8;
        // bonus set to 200
        bonus = 200;
        // But make sure the first printout above still displays as well
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
