package D06_AdvanceCollection;

//6. Create a program to find the union and intersection of two HashSet<Integer>.

import java.util.HashSet;
import java.util.Set;

public class HashSetUnionIntersection {
    public static void main(String[] args) {
        // First HashSet
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        // Second HashSet
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        // Union of set1 and set2
        Set<Integer> union = new HashSet<>(set1);  // clone set1
        union.addAll(set2); // add all elements from set2

        // Intersection of set1 and set2
        Set<Integer> intersection = new HashSet<>(set1); // clone set1
        intersection.retainAll(set2); // retain only common elements


        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}


