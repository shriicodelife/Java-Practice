package D06_AdvanceCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Create a program to shuffle and randomly pick 3 unique elements
// from a list of 10 strings using Collections.shuffle().

public class ShuffleAndPick {
    public static void main(String[] args) {
        // Step 1: Create a list of 10 strings
        List<String> names = new ArrayList<>();
        names.add("Shristi");
        names.add("Aman");
        names.add("Riya");
        names.add("Kunal");
        names.add("Sana");
        names.add("Neha");
        names.add("Raj");
        names.add("Tina");
        names.add("Dev");
        names.add("Arjun");

        // Step 2: Shuffle the list randomly
        Collections.shuffle(names);

        // Step 3: Pick the first 3 unique elements
        System.out.println("3 Randomly Picked Names:");
        for (int i = 0; i < 3; i++) {
            System.out.println("- " + names.get(i));
        }
    }
}
