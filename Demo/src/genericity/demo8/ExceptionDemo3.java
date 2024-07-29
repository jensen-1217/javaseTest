package genericity.demo8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionDemo3 {
   private static final Logger LOGGER = LoggerFactory.getLogger("ExceptionDemo3类");
    public static void main(String[] args) {

        try {
            printInfo("",19);
        }catch (NullPointerException e){
            LOGGER.error(e.getMessage());
        }catch (AgeOutOfBandsException e){
            LOGGER.error(e.getMessage());
        }

    }
    public static void printInfo(String name,int age){
        if(name == null || "".equals(name)){
            throw new NullPointerException("传递的姓名不能为空");
        }
        if(age<18||age>50){
            throw new AgeOutOfBandsException("传递的年龄必须是18-50之间");
        }
        System.out.println(name);
        System.out.println(age);
    }
}
