package D06_AdvanceCollection;

//2. Create a List<Student> where Student is a class with id, name, and marks.
// Sort the list by marks using Comparator.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int id;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;


    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', marks=" + marks + "}";

    }

        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            students.add(new Student("Riya", 90, 85));
            students.add(new Student("Aman", 109, 92));
            students.add(new Student("Kunal", 14, 78));

          System.out.println("Before sorting:");
        for (Student s : students) {
            System.out.println(s);
        }
            // Sorting by marks in ascending order using Comparator
            students.sort(Comparator.comparing(Student::getMarks));

            System.out.println("\nAfter sorting by marks (ascending):");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }



