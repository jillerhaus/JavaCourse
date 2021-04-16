class Dog {
    private static String name;

    public Dog(String name) {
        Dog.name = name;
    }

    public void printName() {
        System.out.println(String.format("name = %s", name));
    }
}

class DogMain {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex"); // create instance (Rex)
        Dog fluffy = new Dog("Fluffy"); // create instance (Fluffy)
        rex.printName(); // prints Fluffy
        fluffy.printName(); // prints Fluffy
    }
}
