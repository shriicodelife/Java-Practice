package D05_CollectionFramework;

import java.util.HashSet;

public class IterateHashSet {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> colors = new HashSet<>();

        // Add elements to the HashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Iterate using for-each loop
        System.out.println("Colors in the HashSet:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}