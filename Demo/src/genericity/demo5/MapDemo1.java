package genericity.demo5;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map =new HashMap<>();
        map.put(1,"Google");
        map.put(2,"Google");
        map.put(1,"Java");
        /*map.clear();*/
        String s = map.get(1);
        map.remove(2);
        System.out.println(map);
        System.out.println(s);
        boolean b = map.containsKey(1);
        System.out.println(b);
    }
}
