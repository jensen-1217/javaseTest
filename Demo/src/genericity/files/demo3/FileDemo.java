package genericity.files.demo3;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file=new File("Dome/files/helloworld.txt");

        file.createNewFile();

        File dir=new File("Dome/files/file");

        dir.mkdir();
        boolean b = file.exists();
        System.out.println(b);

        boolean b1 = file.isFile();
        System.out.println(b1);

        boolean directory = file.isDirectory();
        System.out.println(directory);


        boolean delete = dir.delete();
        System.out.println(delete);
    }
}
