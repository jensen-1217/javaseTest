package genericity.demo8;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionDemo2 {
   private static final Logger LOGGER =LoggerFactory.getLogger("ExceptionDemo2类");

    public static void main(String[] args) {
        int[] array = null;
        try {
            method1(array);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            LOGGER.error(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }

    public static void method1(int[] arr){
        if(arr == null){

            throw new RuntimeException(("传递的参数不能为空"));
        }
    }
}
