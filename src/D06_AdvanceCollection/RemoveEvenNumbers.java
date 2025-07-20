package D06_AdvanceCollection;
//Create a program to remove all even numbers from an ArrayList<Integer> using Iterator.

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveEvenNumbers {
    public static void main(String args[]){
        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(80);
        numbers.add(68);
        numbers.add(15);
        numbers.add(22);
        numbers.add(35);
        numbers.add(40);

        System.out.println("Original list: " + numbers);
        Iterator<Integer> iterator=numbers.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove(); // Safe removal using iterator
            }
        }

        System.out.println("List after removing even numbers: " + numbers);



    }
}
