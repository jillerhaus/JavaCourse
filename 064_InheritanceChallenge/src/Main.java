public class Main {
    public static void main(String[] args) {
        // Challenge
        // Start with a base class Vehicle, then create a Car class that inherits from Vehicle.
        // Finally create another class, a specific type of Car that inherits from the Car class
        // You should be able to handle steering, changing gears, and moving (speed in other words)
        // You will want to decide where to put the appropriate state and behaviors (fields and methods)
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For your specific type of vehicle you will want to add something unique
        Corsa corsa = new Corsa();
        System.out.println(corsa.direction);
        corsa.shift("up");
        System.out.println(corsa.gear);

    }
}
