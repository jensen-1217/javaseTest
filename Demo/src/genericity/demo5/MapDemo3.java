package genericity.demo5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String,String > map =new HashMap<>();
        map.put("周瑜","小乔");
        map.put("孙策","大乔");
        map.put("刘备","孙尚香");
        map.put("诸葛亮","黄月英");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String s = map.get(key);
            System.out.println(s);
        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key="+key+" ,value="+value);
        }

    }
}
