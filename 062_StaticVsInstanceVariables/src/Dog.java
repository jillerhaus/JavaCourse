public class Dog {
    private static String name;
    // is a static variable, so shared between instances

    public Dog (String name) {
        Dog.name = name;
    }

    public void printName() {
        System.out.println("name = " + name);
    }
}
