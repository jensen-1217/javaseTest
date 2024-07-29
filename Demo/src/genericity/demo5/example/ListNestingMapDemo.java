package genericity.demo5.example;

import java.util.*;

public class ListNestingMapDemo {
    public static void main(String[] args) {
       Map<String,String> class1 = new HashMap<>();
       class1.put("20561340238","白岩");
       class1.put("20561340232","白岩2");
       class1.put("20561340233","白岩3");
       class1.put("20561340234","白岩4");

        Map<String,String> class2 = new HashMap<>();
        class2.put("20561340233","白岩");
        class2.put("20561340231","白岩22");
        class2.put("20561340234","白岩33");
        class2.put("20561340235","白岩44");

        Map<String,String> class3 = new HashMap<>();
        class3.put("20561340235","白岩");
        class3.put("20561340223","白岩21");
        class3.put("20561340253","白岩31");
        class3.put("20561340244","白岩44");

        List<Map<String,String>> grade =new ArrayList<>();
        grade.add(class1);
        grade.add(class2);
        grade.add(class3);
        System.out.println(grade);

        for (Map<String, String> classes : grade) {
            Set<Map.Entry<String, String>> entries = classes.entrySet();
            for (Map.Entry<String, String> entry : entries) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key+"  "+value);
            }
            System.out.println("------------");
        }
    }
}
