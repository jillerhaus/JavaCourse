public class Rectangle4 {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle4(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle4(int width, int height) {
        this(0, 0, width, height);
    }

    public Rectangle4() {
        this(0, 0, 0, 0 );
    }
}
