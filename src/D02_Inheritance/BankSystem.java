package D02_Inheritance;
//5. Bank Account System
//Base class BankAccount with accountNumber and balance.
//Subclasses SavingAccount and CurrentAccount add interestRate and overdraftLimit respectively.
//Use inheritance to display account info.

// Base class
class BankAccount {
    String accountNumber;
    double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display basic account info
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

// Subclass: SavingAccount
class SavingAccount extends BankAccount {
    double interestRate;

    // Constructor
    public SavingAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // calling base class constructor
        this.interestRate = interestRate;
    }

    // Method to display full saving account info
    public void displaySavingAccountInfo() {
        displayAccountInfo(); // inherited method
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CurrentAccount
class CurrentAccount extends BankAccount {
    double overdraftLimit;

    // Constructor
    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance); // calling base class constructor
        this.overdraftLimit = overdraftLimit;
    }

    // Method to display full current account info
    public void displayCurrentAccountInfo() {
        displayAccountInfo(); // inherited method
        System.out.println("Overdraft Limit: ₹" + overdraftLimit);
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {
        // Saving account example
        SavingAccount saving = new SavingAccount("SA123456", 15000.0, 3.5);
        System.out.println("Saving Account Details:");
        saving.displaySavingAccountInfo();

        System.out.println();

        // Current account example
        CurrentAccount current = new CurrentAccount("CA789012", 10000.0, 5000.0);
        System.out.println("Current Account Details:");
        current.displayCurrentAccountInfo();
    }
}
