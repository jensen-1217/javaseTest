package genericity.IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("E:\\PMD\\Test\\Dome\\files\\hello.txt");

        byte[] buf = new byte[5];

        int len = fis.read(buf);
        System.out.println(len);
        System.out.println(Arrays.toString(buf));
        System.out.println(new String(buf));

        len=fis.read(buf);

        System.out.println(len);
        System.out.println(Arrays.toString(buf));
        System.out.println(new String(buf));

        len=fis.read(buf);

        System.out.println(len);
        System.out.println(Arrays.toString(buf));
        System.out.println(new String(buf,0,len));

    }
}
