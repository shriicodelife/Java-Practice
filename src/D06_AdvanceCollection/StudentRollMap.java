package D06_AdvanceCollection;
//Create a TreeMap<Integer, String> to store roll numbers and student names.
// Print them in ascending and descending order.
import java.util.Map;
import java.util.TreeMap;

public class StudentRollMap {

    public static void main(String[] args) {

        // Create TreeMap to store roll numbers (keys) and student names (values)
        TreeMap<Integer, String> studentMap = new TreeMap<>();
        studentMap.put(103, "Riya");
        studentMap.put(101, "Aman");
        studentMap.put(104, "Sana");
        studentMap.put(102, "Kunal");

        System.out.println("Students roll num is ascending order");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + "->" + entry.getValue());
        }
            System.out.println(" Students in Descending Order of Roll Number:");
            for (Map.Entry<Integer, String> entry : studentMap.descendingMap().entrySet()) {
                System.out.println("Roll No: " + entry.getKey() + "->" + entry.getValue());
            }

    }
}