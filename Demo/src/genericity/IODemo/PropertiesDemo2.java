package genericity.IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        prop.load(new FileInputStream("E:\\PMD\\Test\\Dome\\src\\genericity\\IODemo\\properties.properties"));
        System.out.println(prop);


    }
}
