package genericity.objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjectOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\PMD\\Test\\Dome\\files\\userList.txt"));

        User user1=new User();
        user1.setName("baiyan");
        user1.setAge(23);
        User user2=new User();
        user2.setName("baiyandebaba");
        user2.setAge(22);

        List<User> userList=new ArrayList<>();
        Collections.addAll(userList,user1,user2);

        oos.writeObject(userList);

        oos.close();
    }
}
