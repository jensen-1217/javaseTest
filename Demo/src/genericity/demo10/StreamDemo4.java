package genericity.demo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo4 {

    public static void main(String[] args) {
        List<String> list1 =new ArrayList<>();
        Collections.addAll(list1,"张","张三","李四","王五五","张三丰");

        List<String> list2 =new ArrayList<>();
        Collections.addAll(list2,"熊大","熊二","张三丰","光头强");



        Stream<String> stream1 = list1.stream();
        Stream<String> stream2 = list2.stream();

        Stream.concat(stream1,stream2)
                .distinct()
                .forEach(name-> System.out.println(name));

    }
}
