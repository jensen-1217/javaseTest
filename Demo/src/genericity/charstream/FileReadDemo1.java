package genericity.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("E:\\PMD\\Test\\Dome\\files\\hello.txt");
        char[] cbuf = new char[2];
        int len = fr.read(cbuf);
        System.out.println(new String(cbuf,0,len));

        fr.close();
    }
}
