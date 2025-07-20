package D06_AdvanceCollection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Use LinkedHashSet to remove duplicates from a list while maintaining insertion order.
public class RemoveDuplicates {

    public static void main(String[] args) {

        List<String> s=new ArrayList<>();
        s.add("RRR");
        s.add("TTT");
        s.add("UUU");
        s.add("UUU");
        s.add("AAA");
        System.out.println("Original List: "+s);

        // LinkedHashSet to remove duplicates and keep insertion order
        Set<String> unique_s = new LinkedHashSet<>(s);

        // Optional: Convert back to List if needed
        List<String> result = new ArrayList<>(unique_s);

        System.out.println("List after removing duplicates: " + result);
    }
}
