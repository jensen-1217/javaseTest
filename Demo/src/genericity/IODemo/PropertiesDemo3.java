package genericity.IODemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo3 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        prop.setProperty("username","admin");
        prop.setProperty("password","123456");

        prop.store(new FileOutputStream("E:\\PMD\\Test\\Dome\\src\\genericity\\IODemo\\properties.properties"),"");



    }
}
