package genericity.IODemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo4 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

       prop.load(new FileInputStream("E:\\PMD\\Test\\Dome\\src\\genericity\\IODemo\\student.properties"));
        System.out.println(prop);

        String name=prop.getProperty("studentName");
        String age=prop.getProperty("studentAge");

        final Student stu = new Student(name, Integer.parseInt(age));

        System.out.println(stu);


    }
}
