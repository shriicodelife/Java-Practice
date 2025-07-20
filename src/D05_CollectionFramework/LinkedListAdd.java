package D05_CollectionFramework;

import java.util.LinkedList;

public class LinkedListAdd {
    public static void main(String[] args) {
        // Create a LinkedList of Integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Initial LinkedList: " + numbers);

        int getvalue = numbers.get(2);
        System.out.println("this is get value: " + getvalue);


        int removevalue = numbers.remove(1);
        System.out.println("Removed value: " + removevalue);


      numbers.add(1, 78);
        System.out.println("add value: " + numbers);

    }
}