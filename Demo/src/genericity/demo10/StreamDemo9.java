package genericity.demo10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class StreamDemo9 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);

        Integer[] array = list.stream()
                .filter(num -> num % 2 == 0)
                .toArray(value -> new Integer[value]);
        System.out.println(Arrays.toString(array));
    }
}
