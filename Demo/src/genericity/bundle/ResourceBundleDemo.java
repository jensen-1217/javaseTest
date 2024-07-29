package genericity.bundle;

import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("properties");
        String username = rb.getString("username");
        System.out.println(username);

    }
}
