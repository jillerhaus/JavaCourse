// You have to represent a point in 2d space. Write a class named Point.


public class Point {
    // The class needs two fields: x,y of type int
    private int x;
    private int y;

    // The class needs to have two constructors.
    // The first constructor does not have any parameters
    public Point() {}

    // The second constructor has parameters x and y of type int and needs to initialize the fields
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Write the following methods
    // getX
    public int getX() {
        return this.x;
    }

    // getY
    public int getY() {
        return this.y;
    }

    // setX
    public void setX(int x) {
        this.x = x;
    }

    // setY
    public void setY(int y) {
        this.y = y;
    }

    // Method named distance without any parameters, it needs to return the distance between this point and 0,0
    public double distance() {
        return distance(0, 0);
    }

    // Method named distance with two parameters, x and y. Both of type int
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    }

    // Method named distance with parameter another of type Point
    public double distance(Point another) {
        return distance(another.x, another.y);
    }
}
