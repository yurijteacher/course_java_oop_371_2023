package unit3;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Vasya");
        map.put(2, "Ivanka");

        System.out.println(map.get(2));


        for (Map.Entry<Integer,String> el : map.entrySet()) {
            System.out.println(el.getKey() + ":" + el.getValue());
        }

        map.remove(1);

        for (Map.Entry<Integer,String> el : map.entrySet()) {
            System.out.println(el.getKey() + ":" + el.getValue());
        }


    }
}
