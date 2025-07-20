package D06_AdvanceCollection;

import java.util.ArrayList;

//. Create a program that removes all null values from an ArrayList<String>.
public class RemoveNullsFromArrayList {

        public static void main(String[] args) {
            // Sample ArrayList with null values
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(76);
            numbers.add(null);
            numbers.add(98);
            numbers.add(null);
            numbers.add(45);

            System.out.println("Original list: " + numbers);
            numbers.removeIf(num -> num == null);


            System.out.println("List after removing nulls: " + numbers);
        }
    }

