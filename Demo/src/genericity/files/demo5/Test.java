package genericity.files.demo5;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        method("E:/PMD/files");
    }
    public static void method(String path){
        File file=new File(path);
        if(!file.exists()){
            throw new RuntimeException("给的路径不存在");
        }

        Map<String,Integer> map=new HashMap<>();
        File[] files = file.listFiles();

        for (File f : files) {
            String name = f.getName();

            int i = name.lastIndexOf(".");
            String lastName = name.substring(i+1);

            if (map.containsKey(lastName)){
                Integer value = map.get(lastName);
                value++;
                map.put(lastName,value);
            }else {
                map.put(lastName,1);
            }

        }
        System.out.println(map);
    }

}
