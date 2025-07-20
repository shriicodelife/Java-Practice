package D05_CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] agrs){

        HashMap<String ,Integer> StudenMarks=new HashMap<>();

        StudenMarks.put("Shristi" ,89);
        StudenMarks.put("deepali" ,76);
        StudenMarks.put("prachi" ,77);
        StudenMarks.put("Shreya" ,80);
        System.out.println("Student Marks:");

        for(Map.Entry<String, Integer>entry:StudenMarks.entrySet()){
            System.out.println(entry.getKey()+ "->"+ entry.getValue() );
        }

    }
}
