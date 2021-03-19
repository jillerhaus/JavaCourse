public class Dog {

    public void bark() {
        System.out.println("woof");
    }

    // Example of overloading
    public void bark(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Bork");
        }
    }
}
