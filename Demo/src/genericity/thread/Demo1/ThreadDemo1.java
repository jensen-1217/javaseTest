package genericity.thread.Demo1;

public class ThreadDemo1{
    public static void main(String[] args) {
        System.out.println("进入main方法执行代码。。。。。");

        MyThread mt=new MyThread();

        mt.start();

        for (int i = 0; i <1000; i++) {
            System.out.println(i);

        }
    }
}
