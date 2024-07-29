package genericity.IODemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =new FileOutputStream("E:\\PMD\\Test\\Dome\\files\\hello.txt",true);

        fos.write("\r\n都是白岩的爸爸".getBytes());
        fos.close();
    }

}
