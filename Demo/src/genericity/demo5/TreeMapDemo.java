package genericity.demo5;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        treeMap.put(5,"java");
        treeMap.put(2,"c++");
        treeMap.put(8,"golang");
        treeMap.put(1,"mysql");
        treeMap.put(9,"python");
        System.out.println(treeMap);
    }
}
