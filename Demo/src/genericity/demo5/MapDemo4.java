package genericity.demo5;

import java.util.HashMap;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<Student,String>studentMap =new HashMap<>();
        studentMap.put(new Student("zs",23),"北京");
        studentMap.put(new Student("ls",24),"上海");
        studentMap.put(new Student("zs",23),"北京");
        System.out.println(studentMap);
        Set<Student> students = studentMap.keySet();
        for (Student student : students) {
            System.out.println(studentMap.get(student));
        }
    }
}
