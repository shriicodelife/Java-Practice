package D06_AdvanceCollection;

//7. Write a program using TreeSet to store a list of custom objects
// Employee(id, name) sorted by name.


import java.util.Comparator;
import java.util.TreeSet;

class Employee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}
public class TreeSetEmployeeSortedByName {
    public static void main(String[] args) {


        // TreeSet with custom comparator to sort by name
        TreeSet<Employee> employees = new TreeSet<>(Comparator.comparing(Employee::getName));

    employees.add(new Employee(103, "Riya"));
        employees.add(new Employee(101, "Aman"));
        employees.add(new Employee(102, "Kunal"));

    // Displaying employees sorted by name
        System.out.println("Employees sorted by name:");
        for (Employee emp : employees) {
        System.out.println(emp);
    }
}
}