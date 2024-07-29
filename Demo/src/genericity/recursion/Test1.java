package genericity.recursion;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        File f = new File("E:\\PMD\\Test\\Dome");
        getJavaFile(f);
    }
    public static void getJavaFile(File file){
        if(!file.exists()){
            throw new RuntimeException("给定的file对象不存在！");
        }
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile()){
                if(f.getName().endsWith(".java")){
                    System.out.println(f.getAbsolutePath());
                }
            }else if(f.isDirectory()){
                getJavaFile(f);
            }
        }
    }
}
