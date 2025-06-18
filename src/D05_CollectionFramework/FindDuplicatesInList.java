package D05_CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicatesInList {

        public static void main(String[] args) {
            // Create a List with some duplicate elements
            ArrayList<String> names = new ArrayList<>();
            names.add("Shristi");
            names.add("Muskan");
            names.add("Prachi");
            names.add("Shreya");
            names.add("Tanisha");
            names.add("Shreya");

            HashSet<String> seen=new HashSet<>();
            HashSet<String> duplicates=new HashSet<>();
            for (String name : names) {
                if (!seen.add(name)) {
                    // add() returns false if item already exists
                    duplicates.add(name);
                }
            }

            // Print duplicates
            System.out.println("Duplicate elements in the list:");
            for (String dup : duplicates) {
                System.out.println(dup);
            }

        }
}
