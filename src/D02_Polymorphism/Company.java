package D02_Polymorphism;

// Base class
class Employee {
    public void work() {
        System.out.println("Employee is working...");
    }
}

// Subclass 1: Manager
class Manager extends Employee {
    @Override
    public void work() {
        System.out.println("Manager is managing the team.");
    }
}

// Subclass 2: Developer
class Developer extends Employee {
    @Override
    public void work() {
        System.out.println("Developer is writing code.");
    }
}

// Main class to demonstrate runtime polymorphism
public class Company {
    public static void main(String[] args) {
        // Step 1: Create an array of Employee references
        Employee[] employees = new Employee[3];

        // Step 2: Store subclass objects in it
        employees[0] = new Manager();
        employees[1] = new Developer();
        employees[2] = new Manager();

        // Step 3: Call overridden methods using a loop
        System.out.println("Employee Work Summary:");
        for (Employee emp : employees) {
            emp.work();  // Runtime polymorphism
        }
    }
}
