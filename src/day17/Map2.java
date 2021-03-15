package day17;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

    public static void main(String[] args) {

        Map<Integer,String> studentMap = new HashMap<>();
        studentMap.put(100, "ram sharma");//key,element
        studentMap.put(102, "sam sharma");
        studentMap.put(110, "hari sharma");
        studentMap.put(115, "mohan sharma");

        System.out.println(studentMap);// OUTPUT: {115=mohan sharma, 100=ram sharma, 102=sam sharma, 110=hari sharma}

        System.out.println("----------------------");

        for (Map.Entry<Integer, String> student : studentMap.entrySet()){
            System.out.println(student.getKey() + " " + student.getValue());//OUTPUT: 115 mohan sharma
                                                                                     //  100 ram sharma
                                                                                    // 102 sam sharma
                                                                                    // 110 hari sharma
        }
    }
}
