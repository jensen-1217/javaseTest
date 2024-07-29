package genericity.demo5.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        Collections.addAll(list,5,6,4,9,8,7);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return n2-n1;
            }
        });
        System.out.println(list);
    }
}
