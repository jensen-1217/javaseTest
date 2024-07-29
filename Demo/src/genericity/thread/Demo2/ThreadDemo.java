package genericity.thread.Demo2;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("进入到main方法执行代码。。。。。");



        Thread t=new Thread(()->{
            System.out.println("新的线程开始执行:");
            for (int i = 100; i <200; i++) {
                System.out.println("新线程"+i);
            }
        });

        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println(i);

        }
    }
}
