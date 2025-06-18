package D05_CollectionFramework;

import java.util.TreeSet;

public class TreeSetSortStrings {
    public static void main(String[] args) {
        // Create a TreeSet of Strings
        TreeSet<String> countries = new TreeSet<>();

        // Add elements to the TreeSet
        countries.add("India");
        countries.add("USA");
        countries.add("Australia");
        countries.add("Germany");
        countries.add("Canada");

        // Print elements (will be in sorted order)
        System.out.println("Countries in sorted order:");
        for (String country : countries) {
            System.out.println(country);
        }
    }
}

