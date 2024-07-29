package genericity.charstream;

import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("E:\\PMD\\Test\\Dome\\files\\hello.txt");
        char[] cbuf = new char[2];
        int len=-1;
        while ((len = fr.read(cbuf))!=-1){
            System.out.println(new String(cbuf,0,len));
        }





        fr.close();
    }
}
