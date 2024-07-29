package genericity.thread.demo3;

public class MyTask implements Runnable {

    @Override
    public void run() {
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("新线程执行：");
        for (int i = 0; i < 1000; i++) {

            System.out.println(Thread.currentThread().getName()+i);

        }
    }
}
