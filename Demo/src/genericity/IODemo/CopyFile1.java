package genericity.IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("E:\\PMD\\Test\\Dome\\files\\hello.txt");

        FileOutputStream fos=new FileOutputStream("E:\\PMD\\Test\\Dome\\files\\hello1.txt");

        int data=0;
        while ((data=fis.read())!=-1){
            fos.write(data);
        }

        fos.close();
        fis.close();
    }
}
