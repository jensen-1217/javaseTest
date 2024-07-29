package genericity.objectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInputStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E:\\PMD\\Test\\Dome\\files\\userList.txt"));

        List<User> userList = (List<User>)ois.readObject();

        ois.close();
        for (User user : userList) {
            System.out.println(user.getName());
        }

    }
}
