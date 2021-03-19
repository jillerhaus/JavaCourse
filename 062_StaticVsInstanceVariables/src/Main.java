public class Main {
    public static void main(String[] args) {

        Dog rex = new Dog("rex"); // Create instance (rex)
        Dog fluffy = new Dog("fluffy"); // Create instance (fluffy)
        rex.printName(); // prints fluffy
        fluffy.printName(); // prints fluffy
        // This prints the same name for both instances because in the dog class the name field is defined as static.
        // This means, it is shared between instances

        Doggo rexxo = new Doggo("rexxo"); // Create instance (rex)
        Doggo fluffo = new Doggo("fluffo"); // Create instance (fluffo)
        rexxo.printName(); // prints rexxo
        fluffo.printName(); // prints fluffo
        // This prints the right name for each instance, because name is an instance variable and each instance of Doggo
        // has its own version.



    }
}
