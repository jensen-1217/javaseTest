package genericity.demo10;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void method4(){
        Stream<String> stream = Stream.of("java","mysql","html");
        System.out.println(stream);
    }

    public static void method3(){
        Integer[] array ={1,2,3,4,5};
        Stream stream = Arrays.stream(array);
        System.out.println(stream);
    }


    public static void method2(){
        Map<String,String> map=new HashMap<>();
        map.put("java","java基础");
        map.put("mysql","mysql入门");

        Stream<Map.Entry<String, String>> stream = map.entrySet().stream();
        System.out.println(stream);
    }

    public static void method1(){
        List<String> list =new ArrayList<>();
        Collections.addAll(list,"熊大","熊二","光头强");
        Stream<String> stream = list.stream();
        System.out.println(stream);
    }

    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
    }
}
