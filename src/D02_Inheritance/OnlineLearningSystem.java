package D02_Inheritance;
//Online Learning System (Abstract class + Polymorphism)
//Create an abstract class Course with methods startCourse() and getDuration().
//Extend it to classes ProgrammingCourse, DesignCourse, and MathCourse.
//Override both methods to give different durations and behavior.
//Store different course objects in an array and call the methods polymorphically.
//
//✅ Concepts Tested:
//Abstraction with abstract classes
//Method overriding
//Polymorphism via abstract class reference

abstract class Course {
    String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Abstract methods
    abstract void startCourse();
    abstract int getDuration();
}
// ProgrammingCourse subclass

class ProgrammingCourse extends Course {
    public ProgrammingCourse() {
        super("Programming Course");
    }

    @Override
    void startCourse() {
        System.out.println(courseName + " started with Java and Python.");
    }

    @Override
    int getDuration() {
        return 12; // 12 weeks
    }
}
// DesignCourse subclass
class DesignCourse extends Course {
    public DesignCourse() {
        super("Design Course");
    }

    @Override
    void startCourse() {
        System.out.println(courseName + " started with Photoshop and Figma.");
    }

    @Override
    int getDuration() {
        return 8; // 8 weeks
    }
}
// MathCourse subclass
class MathCourse extends Course {
    public MathCourse() {
        super("Math Course");
    }

    @Override
    void startCourse() {
        System.out.println(courseName + " started with Algebra and Calculus.");
    }

    @Override
    int getDuration() {
        return 10; // 10 weeks
    }
}
public class OnlineLearningSystem {
    public static void main(String[] args) {
        // Array of Course references
        Course[] courses = new Course[3];

        // Storing subclass objects
        courses[0] = new ProgrammingCourse();
        courses[1] = new DesignCourse();
        courses[2] = new MathCourse();

        // Polymorphic method calls
        for (Course course : courses) {
            course.startCourse();
            System.out.println("Duration: " + course.getDuration() + " weeks\n");
        }
    }
}
