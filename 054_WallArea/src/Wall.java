// Write a class with the name wall
public class Wall {
    // The class needs two fields with name width and height of type double
    private double width;
    private double height;

    // The class needs to have two constructors. The first constructor does not have any parameters
    public Wall() {

    }
    // The Second constructor has parameters width and height of type int and it needs to initialize the fields
    // if the values are less than 0 set them to 0
    public Wall(double width, double height) {
        if (width >= 0) {
            this.width = width;
        } else {
            this.width = 0;
        }

        if (height >= 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    // Write the following methods:
    // 1. Method named getWidth
    public double getWidth() {
        return width;
    }

    // 2. Method named getHeight
    public double getHeight() {
        return height;
    }

    // 3. Method named setWidth
    public void setWidth(double width) {
        // If the parameter is less than 0 set to 0
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // 4. Method named setHeight
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // 5. Method named getArea without any parameters
    public double getArea() {
        return width * height;
    }

}
