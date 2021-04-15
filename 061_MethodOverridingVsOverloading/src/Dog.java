class Dog {

    public void bark() {
        System.out.println("woof");
    }

    public void bark(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("woof");
        }
    }
}

class GermanShepherd extends Dog {
    @Override
    public void bark() {
        System.out.println("woof woof woof");
    }
}

