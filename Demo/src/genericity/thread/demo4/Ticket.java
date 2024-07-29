package genericity.thread.demo4;

public class Ticket implements Runnable {
    private int ticketCount=100;
    @Override
    public void run() {
        while (true){
            if(ticketCount>0){
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"出售票号："+ticketCount);
                ticketCount--;
            }
            if (ticketCount==0){
                break;
            }

        }

    }
}
