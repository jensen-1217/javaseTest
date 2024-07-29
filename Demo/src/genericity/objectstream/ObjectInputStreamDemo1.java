package genericity.objectstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E:\\PMD\\Test\\Dome\\files\\user.txt"));

        User user = (User)ois.readObject();

        ois.close();

        System.out.println(user.getName());
    }
}
