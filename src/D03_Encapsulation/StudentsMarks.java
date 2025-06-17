package D03_Encapsulation;

//1. Student Class with Marks
//Create class Student with private int marks.
//Use setMarks() and getMarks() to access it.
//Prevent setting marks above 100 using logic in setter.
public class StudentsMarks {
    private int marks;

public void setMraks(int marks) {
    if (marks >= 0 && marks <= 100) {
        this.marks = marks;
    } else {
        System.out.println("Invalid marks! Must be between 0 and 100.");

    }
}
public int getMarks() {
    return marks;
}

    public static void main(String[] args) {
    StudentsMarks studentsMarks=new StudentsMarks();
    studentsMarks.setMraks(80);
        System.out.println("Student marks: " + studentsMarks.getMarks());
        studentsMarks.setMraks(190);
        System.out.println("Student marks after invalid input: " + studentsMarks.getMarks());

    }
}

