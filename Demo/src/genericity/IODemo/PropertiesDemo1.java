package genericity.IODemo;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo1 {
    public static void main(String[] args) {
        final Properties prop = new Properties();

        prop.setProperty("java","Java进阶课程");
        prop.setProperty("mysql","mysql数据库");

        System.out.println(prop.getProperty("java"));

        Set<String> keys = prop.stringPropertyNames();
        System.out.println(keys);
    }
}
