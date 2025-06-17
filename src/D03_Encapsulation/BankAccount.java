package D03_Encapsulation;
//2. Bank Account with Balance
//Class BankAccount with private double balance.
//Provide deposit(), withdraw(), and getBalance() methods.
//Disallow negative withdrawals using logic inside withdraw().


public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method with validation
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Cannot withdraw ₹" + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        }
    }

    // Get current balance
    public double getBalance() {
        return balance;
    }

    // Main method to test
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(5000);
        account.withdraw(2000);
        account.withdraw(4000); // Should fail
        account.withdraw(-500); // Invalid

        System.out.println("Current Balance: ₹" + account.getBalance());
    }
}
