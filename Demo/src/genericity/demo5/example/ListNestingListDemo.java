package genericity.demo5.example;

import java.util.ArrayList;
import java.util.List;

public class ListNestingListDemo {
    public static void main(String[] args) {
        List<String> class1 =new ArrayList<>();
        class1.add("lili");
        class1.add("zahngsan");
        class1.add("wangwu");
        class1.add("xiaoming");

        List<String> class2 =new ArrayList<>();
        class2.add("baiyan");
        class2.add("zahngsan");
        class2.add("wangwu");
        class2.add("xiaoming");

        List<String> class3 =new ArrayList<>();
        class3.add("liming");
        class3.add("zahngsan");
        class3.add("wangwu");
        class3.add("xiaoming");

        List<List<String>> garde = new ArrayList<>();
        garde.add(class1);
        garde.add(class2);
        garde.add(class3);

        for (List<String> classes : garde) {
            for (int i = 0; i < classes.size(); i++) {
                String name = classes.get(i);
                System.out.println(name);
            }
            System.out.println("--------------");
        }
    }
}
