class Vehicle {
    int speed;
    private String name;
    private String size;
    private int direction;


    public Vehicle(int speed, String name, String size, int direction) {
        this.speed = 0;
        this.name = name;
        this.size = size;
        this.direction = 0;
    }

    public Vehicle() {
        this.name = "generic Vehicle";
        this.speed = 0;
        this.direction = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getSize() {
        return this.size;
    }

    public String getDirection() {
        return this.direction;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}

