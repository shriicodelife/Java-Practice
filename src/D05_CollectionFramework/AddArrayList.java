package D05_CollectionFramework;
//Add and print all elements in an ArrayList

import java.util.ArrayList;

public class AddArrayList {
    public static void main(String[] args) {

        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Lichi");
        fruits.add("grapes");
        System.out.println("Items in the ArrayList:");


        for (String fruit : fruits) {
            System.out.println(fruits);
        }
    }

}

