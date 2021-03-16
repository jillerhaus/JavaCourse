public class Main {
    public static void main(String[] args) {
        BankAccount moneyBoi = new BankAccount();
        moneyBoi.setAccountNumber(69);
        System.out.println(moneyBoi.getAccountNumber());
        System.out.println(moneyBoi.getBalance());
        moneyBoi.withdraw(69);
        moneyBoi.deposit(69420);
        moneyBoi.withdraw(69);

        BankAccount bobsAccount = new BankAccount();
        bobsAccount.setAccountNumber(12345);
        bobsAccount.withdraw(100);
        bobsAccount.setCustomerName("Bob's Burgers");
        bobsAccount.setPhoneNumber("0190 69420");

        bobsAccount.deposit(50);
        bobsAccount.withdraw(100);

        bobsAccount.deposit(51);
        bobsAccount.withdraw(100);

        BankAccount burgerBob = new BankAccount(69420, 0, "Burgerbob", "emailbob@bob.bob", "69420");
        System.out.println(burgerBob.getCustomerName());

        BankAccount fartAccount = new BankAccount();

        BankAccount timsAccount = new BankAccount("Tim", "Tim@mail.tim","213098");
        System.out.println(timsAccount.getCustomerName());

        System.out.println("***********************");

        VipCustomer bob = new VipCustomer();
        System.out.println(bob.getName());
        System.out.println(bob.getCreditLimit());
        System.out.println(bob.getEmailAddress());

        System.out.println("**********************");

        VipCustomer bort = new VipCustomer("Bort Bortinson", "bort@bort.bort");
        System.out.println(bort.getName());
        System.out.println(bort.getEmailAddress());
        System.out.println(bort.getCreditLimit());

        System.out.println("**********************");

        VipCustomer ernie = new VipCustomer("Ernie Sanders", 420, "butts@bort.fart");
        System.out.println(ernie.getName());
        System.out.println(ernie.getCreditLimit());
        System.out.println(ernie.getEmailAddress());

        System.out.println("**********************");

    }
}
