package genericity.print;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps=new PrintStream("E:\\PMD\\Test\\Dome\\files\\print.txt");

        ps.print(100);
        ps.println(200);
        ps.print("sss");

        ps.close();
    }
}
