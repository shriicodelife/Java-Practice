package D03_Abstraction;
//3. Bank Loan System
//create an Abstract class Loan with method calculateInterest().
//Subclasses HomeLoan, CarLoan override the method with different logic.
//Use abstraction to hide calculation logic.

abstract class Loan{
    double principal;
    double rate;
    int time;

    public Loan(double principal, double rate, int time) {
        this.principal=principal;
        this.rate=rate;
        this.time=time;
    }

        abstract double calculateInterest();
}


    // HomeLoan class
    class HomeLoan extends Loan {
        public HomeLoan(double principal, double rate, int time) {
            super(principal, rate, time);
        }

        @Override
        double calculateInterest() {
            // Simple Interest = (P * R * T) / 100
            return (principal * rate * time) / 100;
        }
    }

class CarLoan extends Loan {
    public CarLoan(double principal, double rate, int time) {
        super(principal, rate, time);
    }

    @Override
    double calculateInterest() {
        // Interest with additional car processing fee logic
        double baseInterest = (principal * rate * time) / 100;
        double processingFee = 500; // flat processing fee
        return baseInterest + processingFee;
    }
}
public class BankLoanSystem {
    public static void main(String[] args) {
        Loan loan;

        // Home Loan
        loan = new HomeLoan(500000, 7.5, 10);
        System.out.println("Home Loan Interest: ₹" + loan.calculateInterest());

        // Car Loan
        loan = new CarLoan(300000, 9.0, 5);
        System.out.println("Car Loan Interest: ₹" + loan.calculateInterest());
    }
}