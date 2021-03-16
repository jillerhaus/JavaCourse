// Create class called VipCustomer

public class VipCustomer {
    // it should have 3 fields: name, creditLimit and emailAddress
    private String name;
    private double creditLimit;
    private String emailAddress;

    // Create 3 constructors
    // 1st constructor empty should call the constructor with 3 parameters
    public VipCustomer() {
        this("FartboiMCFart", 69420, "fart@fart.fart");
    }
    // 2nd constructor should pass the 2 values it receives and add a default value for the 3rd
    public VipCustomer(String name, String emailAddress) {
        this.name = name;
        this.creditLimit = 50000;
        this.emailAddress = emailAddress;
    }
    // 3rd constructor should save all fields.
    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    // create getters only for this using code generation of intellij as setters won't be needed

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
