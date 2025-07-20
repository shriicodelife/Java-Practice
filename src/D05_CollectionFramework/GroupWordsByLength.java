package D05_CollectionFramework;
import java.util.*;

//. Group words by their length using a HashMap<String, List<String>>
//
//Input: A list of words like ["apple", "bat", "cat", "door", "dog"]
//
//Output:
//
//{
//  3=[bat, cat, dog],
//  4=[door],
//  5=[apple]
//}
    public class GroupWordsByLength {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "bat", "cat", "door", "dog");
        Map<Integer, List<String>> groupedWords = new HashMap<>();  //Map<key ,  value> variable name=new Hashmap

        for (String word : words) {
            int lengthKey = word.length();

            // Create list if key doesn't exist and add the word

            groupedWords.computeIfAbsent(lengthKey, k -> new ArrayList<>()).add(word);
        }

        // Print the final map
        System.out.println(groupedWords);
    }
}


