package genericity.demo5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"java");
        map.put(2,"golang");
        map.put(3,"C++");
        map.put(4,"python");
        System.out.println(map);
        Set<Integer> integers = map.keySet();
        System.out.println(integers.toString());
        Collection<String> values = map.values();
        System.out.println(values.toString());
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries.toString());
    }
}
