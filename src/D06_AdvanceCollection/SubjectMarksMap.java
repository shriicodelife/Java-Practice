package D06_AdvanceCollection;
//Create a Map<String, List<Integer>> to represent marks of students by subject.
// Add and print all values.

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubjectMarksMap {

    public static void main(String[] args) {

        // Create Map with subject as key and list of marks as value
        Map<String, List<Integer>> subjectMarks = new HashMap<>();

        // Adding marks for subjects
        subjectMarks.put("Math", Arrays.asList(85, 90, 78));
        subjectMarks.put("Science", Arrays.asList(92, 88, 79));
        subjectMarks.put("English", Arrays.asList(75, 80, 89));

        // Print all subjects with their marks
        System.out.println("Student Marks by Subject:");
        for (Map.Entry<String, List<Integer>> entry : subjectMarks.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
