package day17;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

    public static void main(String[] args) {
        Map<Integer,String> studentMap = new HashMap<>();
        studentMap.put(100, "ram sharma");//key,element
        studentMap.put(102, "sam sharma");
        studentMap.put(110, "hari sharma");
        studentMap.put(115, "mohan sharma");

        System.out.println(studentMap);// OUTPUT: {115=mohan sharma, 100=ram sharma, 102=sam sharma, 110=hari sharma}

        System.out.println(studentMap.get(102));// OUTPUT: sam sharma

        System.out.println(studentMap.containsKey(112));// OUTPUT: false

        System.out.println(studentMap.containsValue("ram sharma"));// OUTPUT: true

        System.out.println(studentMap.size());// OUTPUT: 4

        System.out.println(studentMap.isEmpty());// OUTPUT: false

        System.out.println(studentMap.replace(110, "Kris karki"));//replaces hari sharma with Kris karki; OUTPUT: hari sharma

        System.out.println(studentMap);// OUTPUT: {115=mohan sharma, 100=ram sharma, 102=sam sharma, 110=Kris karki}

        studentMap.clear();// clear the map

        System.out.println(studentMap);// OUTPUT: {}
    }
}
