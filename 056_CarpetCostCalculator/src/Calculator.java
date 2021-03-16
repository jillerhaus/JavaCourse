// Write a class named Calculator

public class Calculator {
    // The class needs to have two fields floor(Floor) and carpet(Carpet)
    private Floor floor;
    private Carpet carpet;

    // The class needs to have one constructor with parameters floor and carpet
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    // Write the following method
    // named getTotalCost without any parameters. return the calculated cost to cover the floor with carpet
    public double getTotalCost() {
        return carpet.getCost() * floor.getArea();
    }
}
