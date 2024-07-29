package genericity.demo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"张","张三","李四","王五五","张三丰");
        System.out.println(list);

        list.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name-> name.length()==3)
                .forEach(name-> System.out.println(name));

        System.out.println("--------------------------------");

        list.stream()
                .skip(1)
                .limit(3)
                .forEach(name-> System.out.println(name));

    }

}
