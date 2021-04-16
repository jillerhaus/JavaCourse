class Doggo {
    private String name;

    public Doggo(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(String.format("name = %s", name));
    }
}

class DoggoMain {
    public static void main(String[] args) {
        Doggo rex = new Doggo("Rex"); // create instance (rex)
        Doggo fluffy = new Doggo("Fluffy"); // create instance (fluffy)
        rex.printName(); // prints Rex
        fluffy.printName(); // prints Fluffy
    }
}
