package genericity.demo9;

import java.util.Date;
import java.util.Random;

public class RandomNumHandlerDome {
    public static void main(String[] args) {
userRandomNumHandler(()->{
    Date date=new Date();
    Random random = new Random(date.hashCode());
    int i = random.nextInt(100);
    return i;
});
    }
    public static void userRandomNumHandler(RandomNumHandler handler){
        int number = handler.getNumber();
        System.out.println(number);
    }
}
