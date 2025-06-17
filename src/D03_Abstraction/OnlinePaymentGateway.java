package D03_Abstraction;
//5. Online Payment Gateway
//Abstract class PaymentMethod with method processPayment(double amount).
//Implement it in UPI, DebitCard, NetBanking.
//Use abstraction to switch payment methods easily.


abstract class PaymentMethod {
    abstract void processPayment(double amount);

    }
// UPI payment implementation
class UPI extends PaymentMethod{
    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }
}
class DebitCard extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Debit Card payment of ₹" + amount);
    }
}
class NetBanking extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Net Banking payment of ₹" + amount);
    }
}
public class OnlinePaymentGateway {

    // A reusable method using polymorphism
    public static void makePayment(PaymentMethod method, double amount) {
        method.processPayment(amount);
    }

    public static void main(String[] args) {
        // Choose payment method dynamically
        PaymentMethod method1 = new UPI();
        PaymentMethod method2 = new DebitCard();
        PaymentMethod method3 = new NetBanking();

        // Call the method
        makePayment(method1, 1000.0);
        makePayment(method2, 2500.5);
        makePayment(method3, 5000.75);
    }
}







