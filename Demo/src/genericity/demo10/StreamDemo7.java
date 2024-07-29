package genericity.demo10;

import java.util.*;

public class StreamDemo7 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Collections.addAll(list,4,5,2,9);


        Optional<Integer> min = list.stream().max((Integer n1, Integer n2) -> n1 - n2);
        System.out.println(min);

        long count = list.stream().filter(num -> num % 2 == 0).count();
        System.out.println(count);

    }
}
