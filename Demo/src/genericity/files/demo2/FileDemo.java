package genericity.files.demo2;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        System.out.println("当前工作目录：" + System.getProperty("user.dir"));

        File f=new File("files\\hello.txt");
        System.out.println(f);
        System.out.println(f.getAbsolutePath());
    }
}
