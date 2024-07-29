package genericity.demo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<String> list1 =new ArrayList<>();
        List<String> list2 =new ArrayList<>();

        Collections.addAll(list1,"张三","张三丰","王五","光头强");
        Collections.addAll(list2,"王三","王三丰","张五","熊大");

        List<String> dui1=new ArrayList<>();
        List<String> dui2=new ArrayList<>();
        List<String> dui3=new ArrayList<>();

        list1.stream()
                .filter(name->name.length()==3)
                .limit(3)
                .forEach(name-> System.out.print(name+"\t"));
        System.out.println();

        list2.stream()
                .filter(name->name.startsWith("张"))
                .skip(2)
                .forEach(name-> System.out.print(name+"\t"));
        System.out.println();

        Stream<String> concat = Stream.concat(list1.stream(), list2.stream());

        List<User> list = concat
                .map(name -> new User(name))
                .collect(Collectors.toList());
        System.out.println(list);

    }
}
