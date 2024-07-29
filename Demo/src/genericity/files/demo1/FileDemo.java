package genericity.files.demo1;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file1 = new File("E:\\files\\hello.txt");
        File file2 = new File("E:/files/hello.txt");

        System.out.println(file1);
        System.out.println(file2);
    }
}
