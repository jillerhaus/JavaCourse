public class Shape2 {
    private int x;
    private int y;

    public Shape2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle5 extends Shape2 {
    private int width;
    private int height;

    // 1st constructor
    public Rectangle5(int x, int y) {
        this(x, y, 0,0); // calls 2nd constructor
    }

    public Rectangle5(int x, int y, int width, int height) {
        super(x, y); // calls the constructor from parent (Shape2)
        this.width = width;
        this.height = height;
    }
}
