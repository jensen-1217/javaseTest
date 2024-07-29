package genericity.IODemo;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        OutputStream os =new FileOutputStream("E:/PMD/files/hello.txt");

        os.write('B');

        os.close();
    }
}
