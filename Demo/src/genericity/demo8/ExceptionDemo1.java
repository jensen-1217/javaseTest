package genericity.demo8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    public static void main(String[] args) throws NullPointerException, ParseException {
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy/MM/dd hh:mm:ss");
        System.out.println(dNow);
        System.out.println("当前时间为: " + ft.format(dNow));
        throw new RuntimeException("ssss");
            //System.out.println(ft.parse("2022-11-07"));
       // System.out.println("程序继续执行");


    }
}
