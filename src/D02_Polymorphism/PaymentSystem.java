package D02_Polymorphism;

//3. Animal Sound Example Base class Animal with method makeSound().
//Subclasses Dog, Cat, Cow override it.
//Demonstrate calling makeSound() using Animal reference

// Defining the interface
interface Payment {
    void pay();  // abstract method
}
class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment done using Credit Card.");
    }
}
class PayPalPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment done using PayPal.");
    }
}
class UPIPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment done using UPI.");
    }
}
public class PaymentSystem {
    public static void main(String[] args) {
        Payment[] payments = new Payment[3];
        payments[0] = new CreditCardPayment();
        payments[1] = new PayPalPayment();
        payments[2] = new UPIPayment();
        for (Payment p : payments) {
            p.pay();  // Runtime polymorphism
        }
    }
}
