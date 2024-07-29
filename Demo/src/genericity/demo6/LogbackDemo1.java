package genericity.demo6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackDemo1 {
   private static Logger logger = LoggerFactory.getLogger("LogbackDemo1类");
    public static void main(String[] args) {
        /*System.out.println("进入到main----");
        System.out.println("调用show");*/
        logger.info("进入到main----");
        logger.debug("调用show");
        show();
    }
    public static void show(){
        //System.out.println("show执行");
        logger.trace("show执行");
        logger.error("ssss");
        logger.warn("sqw");
    }
}
