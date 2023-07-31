package 多线程.syn;

/**
 *
 */
public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket sattion = new BuyTicket();
        new Thread(sattion,"你").start();
        new Thread(sattion,"我").start();
        new Thread(sattion,"黄牛").start();
    }
}
class BuyTicket implements Runnable{
    private int ticketNuns = 30;
    boolean flag =true;
    @Override
    public void run() {
        while (flag){
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    private synchronized void buy() throws InterruptedException{
        //判断是否有票
        if (ticketNuns <= 0){
            flag =false;
            return;
        }
        Thread.sleep(100);
        //买票
        System.out.println(Thread.currentThread().getName()+ "拿到"+ ticketNuns --);
    }
}
