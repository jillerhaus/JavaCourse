
// The carpet company has asked you to write an application that calculates the price of carpeting for rectangular rooms.
// Write a class called Floor.

public class Floor {
    // The class needs two fields of type double with name width and length
    private double width;
    private double length;

    //The class needs one constructor with parameters width and length
    public Floor(double width, double length) {
        // in case the width or length are less than 0 set them to 0 respectively
        this.length = length < 0 ? 0 : length;
        this.width = width < 0 ? 0 : width;
    }

    // write the following methods
    // * Method named getArea
    public double getArea() {
        return length * width;
    }

    //
}
