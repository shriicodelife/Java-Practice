package D05_CollectionFramework;

//2. Count the frequency of elements in a list using HashMap
//
//Input: ["apple", "banana", "apple", "orange", "banana", "apple"]
//
//Output:
//
//{
//  apple=3,
//  banana=2,
//  orange=1
//}

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        // Create a HashMap to store frequency

        Map<String, Integer> frequencyMap = new HashMap<>();

        // Loop through the list
        for (String fruit : fruits) {
            // If fruit is already present, increment its count; else, set it to 1
            frequencyMap.put(fruit, frequencyMap.getOrDefault(fruit, 0) + 1);
        }
        // Print the frequency map
        System.out.println(frequencyMap);
    }


}