package genericity.files.demo4;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file=new File("E:\\NARAKABLADEPOINT");

        File[] files=file.listFiles();

        for (File f : files) {
            System.out.println(f);
        }
    }
}
