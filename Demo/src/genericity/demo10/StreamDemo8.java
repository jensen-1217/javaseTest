package genericity.demo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo8 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);

       list= list.stream()
                .filter(num->num%2==0)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
