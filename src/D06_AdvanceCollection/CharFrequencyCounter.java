package D06_AdvanceCollection;
//Count character frequency in a string using HashMap<Character, Integer>.

import java.util.HashMap;
import java.util.Map;

public class CharFrequencyCounter {
    public static void main(String[] args) {
        String str = "hello world";

        // Convert string to lowercase and remove spaces
        str = str.toLowerCase().replaceAll("\\s", "");

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Loop through each character in the string
        for (char c : str.toCharArray()) {
            // If the character is already in map, increment count
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If character not in map, add it with count 1
                charCountMap.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());

        }
    }

}