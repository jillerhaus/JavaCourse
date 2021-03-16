// Write a class with the name carpet

public class Carpet {
    // The class needs one field with name cost of type double
    private double cost;

    // The class needs one constructor with parameter cost of type double and it needs to initialize the field
    public Carpet(double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }

    // Write the following methods
    // Method named getCost without any parameters. return value of cost
    public double getCost() {
        return cost;
    }
}
