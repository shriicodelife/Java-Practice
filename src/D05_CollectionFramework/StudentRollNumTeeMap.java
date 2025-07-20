package D05_CollectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class StudentRollNumTeeMap {

        public static void main(String[] args) {

            // TreeMap stores entries sorted by keys

            Map<Integer, String> studentMap = new TreeMap<>();

            // Adding student roll numbers and names
            studentMap.put(103, "Shristi");
            studentMap.put(101, "Muskan");
            studentMap.put(102, "Prachi");

            // Print the TreeMap (sorted by roll number)
            System.out.println(studentMap);
        }

}
