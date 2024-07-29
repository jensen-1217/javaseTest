package genericity.thread.Demo1;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("新的线程开始执行");
        for (int i = 100; i <200; i++) {
            System.out.println("新线程"+i);
        }
    }
}
