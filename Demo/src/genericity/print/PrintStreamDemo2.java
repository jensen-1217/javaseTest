package genericity.print;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps=new PrintStream("E:\\PMD\\Test\\Dome\\files\\print.txt");

        System.setOut(ps);
        System.out.println("使用打印流");

        ps.close();
    }
}
