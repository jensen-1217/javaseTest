package genericity.IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        InputStream is =new FileInputStream("E:\\PMD\\Test\\Dome\\files\\hello.txt");

        int data=0;
        while ((data=is.read())!=-1){

            System.out.println((char)data);

        }


//        char read = (char)is.read();
//        System.out.println(read);
//        char read2 = (char)is.read();
//        System.out.println(read2);
//        char read3 = (char)is.read();
//        System.out.println(read3);
//        char read4 = (char)is.read();
//        System.out.println(read4);


      is.close();
    }
}
