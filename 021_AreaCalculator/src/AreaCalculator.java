public class AreaCalculator {

    // Write a method named area with one double parameter named radius.
    // The method needs to return a double area that represents the area of a circle
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.PI * Math.pow(radius, 2);
    }

    // Write another overloaded method with 2 parameters x and y (both doubles)
    // The method needs to return the area of a rectangle
    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1;
        }
        return x * y;
    }
}
