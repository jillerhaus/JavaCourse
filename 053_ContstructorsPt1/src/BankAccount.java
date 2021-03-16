// Create a new class for a bank account
public class BankAccount {
    // Create fields for the account number, balance, customer name, email and phone number
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(9999, 100.55, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount() {
        this(56789, 2.50, "Default Name", "DefaultAdress", "DefaultPhone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Create getter and setters for each field
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Create two additional methods
    // 1. To allow customers to deposit funds
    public void deposit (double money) {
        this.balance += money;
        System.out.println("You have deposited: " + money + " moneyz. Your new account balance is: " + this.balance + " moneyz");
    }

    // 2. To allow customers to withdraw funds This should deduct from the balance field
    // but not allow the withdrawal to complete if their funds are insufficient.
    public void withdraw(double money) {
        if (this.balance >= money) {
            this.balance -= money;
            System.out.println("You have taken out " + money + " moneyz. Your new balance is " + this.balance + " moneyz.");
        } else {
            System.out.println("Ya aint got moneyz. Your maximum withdrawal is " + this.balance + " moneyz");
        }
    }


}
