package genericity.demo5.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShufferDemo {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
