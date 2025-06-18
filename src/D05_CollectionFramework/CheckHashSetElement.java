package D05_CollectionFramework;
import java.util.HashSet;

public class CheckHashSetElement {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> animals = new HashSet<>();

        // Add elements to the HashSet
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Tiger");
        animals.add("Lion");

        // Element to search
        String searchAnimal = "Tiger";

        // Check if HashSet contains the element
        if (animals.contains(searchAnimal)) {
            System.out.println(searchAnimal + " is present in the HashSet.");
        } else {
            System.out.println(searchAnimal + " is not present in the HashSet.");
        }
    }
}
