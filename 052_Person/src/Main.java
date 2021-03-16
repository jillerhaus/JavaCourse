public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("full name = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("Bob");
        person.setAge(18);
        System.out.println("full name = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Burgers");
        System.out.println("full name = " + person.getFullName());
    }
}
