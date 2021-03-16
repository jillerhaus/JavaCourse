public class FactorPrinter {
    // Write a method called printFactors with one parameter of type int named number
    public static void printFactors(int number) {
        // if the number < 1, the method should print "Invalid Value"
        if (number < 1 ){
            System.out.println("Invalid Value");
        } else {
            // The method should print all factors of the number
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
