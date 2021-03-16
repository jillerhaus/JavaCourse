// Write a class named Person.

public class Person {
    // The class needs three fields (instance variables): firstName, lastName (Strings) and age (int)
    private String firstName;
    private String lastName;
    private int age;

    // Methods getLastName, getFirstName, getAge,
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // setFirstName, setLastName, setAge
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Method named setAge with one parameter of type int it needs to set the value of age field. If the parameter is
    // less than 0 or more than 100 it needs to set the field value to 0
    public void setAge(int age) {
        if ((age < 0) || (age > 100)) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Method named isTeen without any parameters. it needs to return true for age [13, 19]
    public boolean isTeen() {
        return ((age < 20) && (age > 12));
    }

    // Method named getFullName without any parameters. it needs to return the full name of the person
    // * in case both first and lastName fields are empty, Strings return an empty String
    // * in case lastName is an empty String return firstName
    // * in case firstName is an empty String return lastName
    // To check if string is empty use .isEmpty()
    public String getFullName() {
        if (((firstName == null) || (firstName.isEmpty())) && ((lastName == null)|| (lastName.isEmpty()))) {
            return "";
        } else if ((firstName == null) || (firstName.isEmpty())) {
            return lastName;
        } else if ((lastName == null) || (lastName.isEmpty())) {
            return firstName;
        }
        return String.format("%s %s", firstName, lastName);
    }

}
