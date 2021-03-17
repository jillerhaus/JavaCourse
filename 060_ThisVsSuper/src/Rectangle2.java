public class Rectangle2 extends Shape {
    private int width;
    private int height;

    // 1st constructor
    public Rectangle2(int x, int y) {
        this (x,y,0,0); // calls 2nd constructor
    }

    // 2nd constructor
    public Rectangle2 (int x, int y, int width, int height) {
        super(x,y); // calls the constructor from parent (Shape)
        this.width = width;
        this.height = height;
    }

}
