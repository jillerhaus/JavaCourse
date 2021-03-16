public class DiagonalStar {
    // Write a method called printSquareStar with one parameter of type int named number
    public static void printSquareStar(int number) {
        // If teh number is <5 the method should print invalid value
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            // The method should print diagonals to generate a rectangular pattern composed of stars.
            // This should be accomplished by using loops
            // for printSquareStar(5):
            // *****
            // ** **
            // * * *
            // ** **
            // *****

            // ********
            // **    **
            // * *  * *
            // *  **  *
            // * *  * *
            // **    **
            // ********

            for (int row = 1; row <= number; row++) {
                for (int column = 1; column <= number; column++) {
                    if ((row == 1) || (row == number)) {
                        System.out.print("*");
                    } else if ((column == 1) || (column == number)) {
                        System.out.print("*");
                    } else if (row == column) {
                        System.out.print("*");
                    } else if (column == number - row + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }

        }



    }
}
