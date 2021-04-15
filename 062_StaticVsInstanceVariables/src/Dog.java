public class Dog {

    public void bark() {
        System.out.println("woof");
    }
}

class DogMain {
    public static void main(String[] args) {
        Dog rex = new Dog(); // create instance
        rex.bark(); // call isntatance method
    }
}
