package genericity.demo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        List<String>list1=new ArrayList<>();
        List<String>list2=new ArrayList<>();
        Collections.addAll(list,"张","张三","李四","王五五","张三丰");
        for (String name : list) {
            if(name.startsWith("张")){
                list1.add(name);
                if(name.length()==3){
                    list2.add(name);
                }
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list);
    }
}
