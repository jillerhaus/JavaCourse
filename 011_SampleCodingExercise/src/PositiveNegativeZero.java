public class PositiveNegativeZero {

    public static void main(String[] args) {

        checkNumber(0);
        checkNumber(-159);
        checkNumber(569);

    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("negative");
        }

    }
}
