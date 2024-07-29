package genericity.demo5;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student,String> treeMap=new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                int result = o2.getAge() - o1.getAge();
                return result == 0? o2.getName().compareTo(o1.getName()): result;
            }
        });
        treeMap.put(new Student("ccc",12),"java");
        treeMap.put(new Student("aaa",14),"java");
        treeMap.put(new Student("bbb",11),"java");
        treeMap.put(new Student("fff",15),"java");
        treeMap.put(new Student("rrr",12),"java");

        System.out.println(treeMap);
    }
}
