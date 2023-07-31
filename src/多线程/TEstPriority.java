package 多线程;

/**
 * 线程优先级
 */
public class TEstPriority {
    public static void main(String[] args) {
        MyPriority myPriority = new MyPriority();
        Thread t1 = new Thread(myPriority);
        Thread t2 = new Thread(myPriority);
        Thread t3 = new Thread(myPriority);
        t1.setPriority(1);
        t1.start();
        t2.setPriority(10);
        t2.start();
        t3.setPriority(3);
        t3.start();
    }
}
class MyPriority implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "=====>" + Thread.currentThread().getPriority());
    }
}
