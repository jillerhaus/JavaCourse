public class SuperClass { // parent class aka super class
    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
}

class SubClass extends SuperClass { // subclass aka child class
    // overrides method from parent
    @Override
    public void printMethod() {
        super.printMethod(); // calls method in SuperClass (parent)
        System.out.println("Printed in Subclass");
    }

}

class MainClass {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.printMethod();
    }
}
