package D02_Inheritance;
//3. University System
//Create a Person class.
//Extand it to Student and Professor with their own fields like grade or subject.
//Demonstrate accessing inherited and subclass fields together.

//Parent class
class Person{
    int age;
    String name;


    // Constructor
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    // Common method to display basic info
    public void displayInfo(){
        System.out.println("NAME:" +name);
        System.out.println("AGE:" +age);

    }
}
// Derived class: Student
class Student extends Person{
    String grade;

    // Constructor with chaining
public Student(String name,String grade,int age){
    super(name,age);// Call to Person constructor
    this.grade=grade;
}
    // Method to display student details
    public void displayStudentDetails() {
        displayInfo(); // inherited from Person
        System.out.println("Grade: " + grade);
    }
}
// Derived class: Professor
class Professor extends Person{
    String subject;

     // Constructor with chaining

    public Professor(String name, int age,String subject ){
        super(name,age);//Call to Person constructor
        this.subject=subject;
    }

    // Method to display professor details
    public void displayProfessorDetails(){
        displayInfo(); // inherited from Person
        System.out.println("subject:" + subject);

    }
}
// Main class to test
public class UniversitySystem {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student("shristi", "A+", 22);
            System.out.println("Student Details:");
            student.displayStudentDetails();
            System.out.println();


        // Creating a Professor object
        Professor professor = new Professor("Dr. Singh", 45, "Physics");
        System.out.println("Professor Details:");
        professor.displayProfessorDetails();
    }
}

