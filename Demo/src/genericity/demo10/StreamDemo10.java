package genericity.demo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo10 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"zhangsan,23","lisai,24","wangwu,25");

        Map<String, String> map = list.stream()
                .filter(str -> Integer.parseInt(str.split(",")[1]) >= 24)

                .collect(Collectors.toMap(s -> s.split(",")[0], s -> s.split(",")[1]));
        System.out.println(map);
    }
}
