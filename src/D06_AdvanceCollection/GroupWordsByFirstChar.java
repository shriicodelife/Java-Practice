package D06_AdvanceCollection;

//Write a program to group words by their starting character
// using HashMap<Character, List<String>>.

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupWordsByFirstChar {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mall");
        fruits.add("Graps");
        fruits.add("Got");
        fruits.add("Alovera");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Gavava");

        Map<Character , List<String>> groupeWords=new HashMap<>();
        for(String fruit:fruits){
            char firstChar = fruit.charAt(0);
            groupeWords.computeIfAbsent(firstChar, k -> new ArrayList<>()).add(fruit);
        }

        // Print the grouped words
        System.out.println("Grouped words by first character:");
        for (Map.Entry<Character, List<String>> entry : groupeWords.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}



