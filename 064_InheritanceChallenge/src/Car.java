class Car extends Vehicle {


    int gear;
    int maxGear;

    public Car() {
        super();
        this.name = "generic Car";
        this.gear = 0;
        this.direction = "straight";
        this.maxGear = 6;
    }

    public void gasPedal() {
        this.speed += 10;
    }

    public void breakPedal() {
        this.speed = 0;
    }

    public void steer(String direction) {
        this.direction = direction;
    }

    public void shift(String direction) {
        if (direction == "up") {
            if ((gear >= 0 ) && (gear < maxGear)) {
                this.gear += 1;
            } else {
                System.out.println("can't shift up you are in " + gear + " gear.");
            }


        } else if (direction == "down") {
            if ((gear <= maxGear) && (gear > 1)) {
                this.gear -= 1;
            } else {
                System.out.println("can't shift down you are in " + gear + " gear");
            }
        } else if (direction == "neutral") {
            this.gear = 0;
        } else if (direction == "reverse") {
            this.gear = -1;
        } else {
            System.out.println("unknown shifting direction: try 'up', 'down', 'neutral' or 'reverse'");
        }
    }

}
