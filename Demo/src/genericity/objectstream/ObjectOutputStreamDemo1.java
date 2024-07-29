package genericity.objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\PMD\\Test\\Dome\\files\\user.txt"));

        User user=new User();
        user.setName("baiyan");
        user.setAge(23);

        oos.writeObject(user);

        oos.close();
    }
}
