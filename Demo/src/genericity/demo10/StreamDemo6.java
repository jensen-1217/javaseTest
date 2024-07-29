package genericity.demo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo6 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        Collections.addAll(list,5,9,8,6,1,3,2);

        System.out.println(list);

        list.stream()
                .sorted()
                .forEach(obj-> System.out.print(obj+"\t"));

        System.out.println();

        list.stream()
                .sorted((num1,num2)->num2-num1)
                .forEach(num-> System.out.print(num+"\t"));
        System.out.println();


    }
}
