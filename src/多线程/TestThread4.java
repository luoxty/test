package 多线程;

/**
 * 多个线程同时操作同一个对象
 * 购买火车票案例
 */
public class TestThread4 implements Runnable{
    //票数
    private int tickeNums=10;
    @Override
    public void run() {
        while (true){
            if (tickeNums<=0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +"拿到了第" + tickeNums-- +"票");
        }
    }

    public static void main(String[] args) {
        TestThread4 tickes = new TestThread4();
        new Thread(tickes,"小明").start();
        new Thread(tickes,"老师").start();
        new Thread(tickes,"黄牛").start();
    }
}
