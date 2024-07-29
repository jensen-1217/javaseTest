package genericity.charstream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\PMD\\Test\\Dome\\files\\hello.txt");
        fw.write("黑\r\n");
        fw.write("黑");

        fw.write("程序员",0,2);




        fw.close();
    }
}
