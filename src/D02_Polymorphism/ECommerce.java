package D02_Polymorphism;


// Base class
class Product {
    public double getDiscount() {
        return 0.0; // No discount by default
    }

    public void showDiscount() {
        System.out.println("Discount: " + getDiscount() + "%");
    }
}

// Subclass: Electronics
class Electronics extends Product {
    @Override
    public double getDiscount() {
        return 10.0; // 10% discount
    }
}

// Subclass: Clothing
class Clothing extends Product {
    @Override
    public double getDiscount() {
        return 20.0; // 20% discount
    }
}

// Subclass: Groceries
class Groceries extends Product {
    @Override
    public double getDiscount() {
        return 5.0; // 5% discount
    }
}

// Main class to demonstrate polymorphism
public class ECommerce {
    public static void main(String[] args) {
        // Array of base class references
        Product[] products = new Product[3];
        products[0] = new Electronics();
        products[1] = new Clothing();
        products[2] = new Groceries();

        // Loop through and show discount using polymorphism
        System.out.println("Discounts on Products:");
        for (Product p : products) {
            p.showDiscount(); // Calls correct overridden method
        }
    }
}
