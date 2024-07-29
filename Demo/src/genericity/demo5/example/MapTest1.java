package genericity.demo5.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
    public static void main(String[] args) {
        String str ="aababcabcdabcde";
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch =str.charAt(i);
            if(map.containsKey(ch)){
                Integer value = map.get(ch);
                value++;
                map.put(ch,value);
            }else {
                map.put(ch,1);
            }
        }
        System.out.println(map);
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.print(key+" ("+value+") ");
        }
    }
}
