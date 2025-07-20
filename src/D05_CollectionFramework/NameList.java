package D05_CollectionFramework;

import java.util.ArrayList;

public class NameList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Shristi");
        names.add("prachi");
        names.add("deepali");
        names.add("shreya");
        System.out.println("NameList: " );
        for(String name:names);
        System.out.println(names);


    }
}
