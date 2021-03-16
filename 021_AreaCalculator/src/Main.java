public class Main {
    public static void main(String[] args) {
        testArea(69);
        testArea(5,6);

    }

    public static void testArea(double radius) {
        System.out.println(String.format("Circle with radius %.2f has area of: %.2f", radius, AreaCalculator.area(radius)));
    }

    public static void testArea(double x, double y) {
        System.out.println(String.format("Rectangle with x = %06.2f and y = %.2f has area of: %.2f", x, y,
                AreaCalculator.area(x, y)));
    }
}
