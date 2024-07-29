package genericity.IODemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutPutStreamDemo2 {
    public static void main(String[] args) throws IOException {
        OutputStream fos =new FileOutputStream("E:\\PMD\\Test\\Dome\\files\\hello.txt");

//      fos.write("我是白岩的爸爸".getBytes());
        byte[] buf = "我是白岩的爸爸".getBytes();
        fos.write(buf,0,6);

        fos.close();
    }
}
