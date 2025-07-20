package D06_AdvanceCollection;
//Create a Map<Integer, Map<String, Integer>> to store student roll numbers
// with subject-wise marks. Display in formatted way.
import java.util.*;

public class StudentMarksNestedMap {
    public static void main(String[] args) {

        // Outer Map: Roll No → (Subject → Marks)
        Map<Integer, Map<String, Integer>> studentMarks = new HashMap<>();

        // Marks for Roll No 101
        Map<String, Integer> marks101 = new HashMap<>();
        marks101.put("Math", 85);
        marks101.put("Science", 90);
        marks101.put("English", 78);
        studentMarks.put(101, marks101);

        // Marks for Roll No 102
        Map<String, Integer> marks102 = new HashMap<>();
        marks102.put("Math", 75);
        marks102.put("Science", 88);
        marks102.put("English", 82);
        studentMarks.put(102, marks102);

        // Marks for Roll No 103
        Map<String, Integer> marks103 = new HashMap<>();
        marks103.put("Math", 92);
        marks103.put("Science", 86);
        marks103.put("English", 80);
        studentMarks.put(103, marks103);

        // 📋 Display in formatted way
        System.out.println("🎓 Student Marks:");
        System.out.println("Roll No | Math | Science | English");
        System.out.println("----------------------------------");

        for (Map.Entry<Integer, Map<String, Integer>> entry : studentMarks.entrySet()) {
            Integer roll = entry.getKey();
            Map<String, Integer> subjectMarks = entry.getValue();

            int math = subjectMarks.getOrDefault("Math", 0);
            int science = subjectMarks.getOrDefault("Science", 0);
            int english = subjectMarks.getOrDefault("English", 0);

            System.out.printf("%7d | %4d | %7d | %7d%n", roll, math, science, english);
        }
    }
}
