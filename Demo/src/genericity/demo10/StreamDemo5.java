package genericity.demo10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StreamDemo5 {
    public static void main(String[] args) {
        List<User> list=new ArrayList<>();
        list.add(new User("张三"));
        
        list.stream()
                .map(user -> new SuperMan(user.getName()))
                .forEach(name-> System.out.println(name));
    }
}
