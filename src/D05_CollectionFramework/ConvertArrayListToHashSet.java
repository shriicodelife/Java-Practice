package D05_CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertArrayListToHashSet {
    public static void main(String[] args) {
        // Create an ArrayList with some duplicate elements
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");
        namesList.add("Alice");     // Duplicate
        namesList.add("David");

        // Print original ArrayList
        System.out.println("ArrayList:");
        System.out.println(namesList);

        // Convert ArrayList to HashSet (duplicates will be removed)
        HashSet<String> namesSet = new HashSet<>(namesList);

        // Print the HashSet
        System.out.println("HashSet (after conversion):");
        System.out.println(namesSet);
    }
}

