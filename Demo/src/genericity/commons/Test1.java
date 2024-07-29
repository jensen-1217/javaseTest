package genericity.commons;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream src=new FileInputStream("E:\\PMD\\Test\\Dome\\files\\print.txt");
        OutputStream dest=new FileOutputStream("E:\\PMD\\Test\\Dome\\files\\println.txt");

        try {
            IOUtils.copy(src,dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
