package genericity.thread.demo10;

import java.util.concurrent.*;

public class Test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10);

        Callable<Integer> task=new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum=0;
                for (int i = 1; i < 10; i++) {
                    sum+=i;
                }
                return sum;
            }
        };
        Future<Integer> future = es.submit(task);
        System.out.println("计算结果"+future.get());
    }
}
