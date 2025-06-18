package D05_CollectionFramework;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class SearchArrayList {
    public static void main(String[] args){
        LinkedList<String> fruits=new LinkedList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Lichi");

        String searchfruit="Banana";
        if(fruits.contains(searchfruit)) {
            System.out.println(searchfruit+" found in the LinkedList." );
        } else{
            System.out.println(  searchfruit+" not found in the LinkedList.");

        }



    }
}
