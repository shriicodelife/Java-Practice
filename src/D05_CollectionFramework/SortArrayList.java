package D05_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(25);
        numbers.add(10);
        numbers.add(50);
        numbers.add(5);
        numbers.add(30);

        // Print original list
        System.out.println("Original List:");
        System.out.println(numbers);

        // Sort the ArrayList in ascending order
        Collections.sort(numbers);

        // Print sorted list
        System.out.println("Sorted List (Ascending):");
        System.out.println(numbers);
    }
}