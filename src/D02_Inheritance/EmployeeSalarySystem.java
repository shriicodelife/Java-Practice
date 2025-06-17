package D02_Inheritance;
//2. Employee Salary System
//Create a base class Employee with basic info.
//Extend it to PermanentEmployee and ContractEmployee, both calculating salary differently.
//Use constructor chaining (super) and display salary using inherited methods.


// Base class
class Employee {
    String name;
    int id;

    // Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display basic employee details
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
    }

    // Placeholder for salary (can be overridden)
    public void calculateSalary() {
        System.out.println("Salary calculation not defined for base employee.");
    }
}

// Derived class: PermanentEmployee
class PermanentEmployee extends Employee {
    double basicSalary;
    double hra;
    double da;

    public PermanentEmployee(int id, String name, double basicSalary, double hra, double da) {
        super(id, name); // Calling base constructor
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.da = da;
    }

    @Override
    public void calculateSalary() {
        double totalSalary = basicSalary + hra + da;
        displayInfo(); // Reusing base method
        System.out.println("Total Salary (Permanent): ₹" + totalSalary);
    }
}

// Derived class: ContractEmployee
class ContractEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    public ContractEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name); // Calling base constructor
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void calculateSalary() {
        double totalSalary = hoursWorked * hourlyRate;
        displayInfo(); // Reusing base method
        System.out.println("Total Salary (Contract): ₹" + totalSalary);
    }
}

// Main class to test
public class EmployeeSalarySystem {
    public static void main(String[] args) {
        // Permanent employee
        PermanentEmployee pe = new PermanentEmployee(101, "Shristi", 30000, 5000, 3000);
        System.out.println("Permanent Employee Details:");
        pe.calculateSalary();

        System.out.println();

        // Contract employee
        ContractEmployee ce = new ContractEmployee(202, "Aman", 160, 250);
        System.out.println("Contract Employee Details:");
        ce.calculateSalary();
    }
}
