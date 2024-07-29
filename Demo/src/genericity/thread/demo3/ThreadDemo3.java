package genericity.thread.demo3;

public class ThreadDemo3 {
    public static void main(String[] args) {
        new Thread(new MyTask(),"新线程").start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        for (int i = 0; i < 200; i++) {
            System.out.println(Thread.currentThread().getName()+"="+i);

        }
    }
}
