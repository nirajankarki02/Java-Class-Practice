package day17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map3 {

    public static void main(String[] args) {
        //prints in random order
        Map<Integer,String> studentMap = new HashMap<>();
        studentMap.put(100, "ram sharma");//key,element
        studentMap.put(102, "sam sharma");
        studentMap.put(110, "hari sharma");
        studentMap.put(115, "mohan sharma");

        System.out.println("hash map is: ");

        for (Map.Entry<Integer, String> student : studentMap.entrySet()){
            System.out.println(student.getKey() + " " + student.getValue());
        }

        System.out.println("================");

        //prints in insertion order
        Map<Integer,String> studentMap2 = new LinkedHashMap<>();
        studentMap2.put(100, "ram sharma");//key,element
        studentMap2.put(102, "sam sharma");
        studentMap2.put(110, "hari sharma");
        studentMap2.put(115, "mohan sharma");

        System.out.println("Linked hash map is: ");

        for (Map.Entry<Integer, String> student : studentMap2.entrySet()){
            System.out.println(student.getKey() + " " + student.getValue());
        }

        System.out.println("================");

        //prints in sorted natural order
        Map<Integer,String> studentMap3 = new TreeMap<>();
        studentMap3.put(100, "ram sharma");//key,element
        studentMap3.put(102, "sam sharma");
        studentMap3.put(110, "hari sharma");
        studentMap3.put(115, "mohan sharma");

        System.out.println("tree map is: ");

        for (Map.Entry<Integer, String> student : studentMap3.entrySet()){
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }
}
