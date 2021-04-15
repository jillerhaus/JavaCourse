class Calculator {

    public static void printSum(int a, int b) {
        System.out.println(String.format("sum = %d", a+b));
    }

    public static void printHello() {
        System.out.println("Hello");
    }
}

class MainCalculator{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.printSum(3,5);
        calc.printHello();
        Calculator.printHello();
        printHello();

    }

    public static void printHello() {
        System.out.println("Hello");
    }
}
