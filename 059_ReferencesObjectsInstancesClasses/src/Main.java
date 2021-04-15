public class Main {
    public static void main(String[] args) {

        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        System.out.println(blueHouse.getColor()); // prints blue
        System.out.println(anotherHouse.getColor()); // blue

        anotherHouse.setColor("red");
        System.out.println(blueHouse.getColor()); // red
        System.out.println(anotherHouse.getColor()); // red

        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println(blueHouse.getColor()); // red
        System.out.println(greenHouse.getColor()); // green
        System.out.println(anotherHouse.getColor()); // green


        Houses blueHouses = new Houses("blue");
        Houses anotherHouses = blueHouses;

        System.out.println(blueHouses.getColor()); // blue
        System.out.println(anotherHouses.getColor()); // blue

        anotherHouses.setColor("red");
        System.out.println(blueHouses.getColor()); // green
        System.out.println(anotherHouses.getColor()); // green

        Houses greenHouses = new Houses("green");
        anotherHouses = greenHouses;

        System.out.println(blueHouses.getColor()); // red
        System.out.println(anotherHouses.getColor()); // green
        System.out.println(greenHouses.getColor()); // green


    }
}
