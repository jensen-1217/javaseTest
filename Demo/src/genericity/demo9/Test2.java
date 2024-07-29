package genericity.demo9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        Collections.addAll(list,5,7,4,2,9);

        /*Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return n2-n1;
            }
        });*/
        Collections.sort(list,(Integer n1,Integer n2)->{
            return n1-n2;
        });


        System.out.println(list);
    }
}
