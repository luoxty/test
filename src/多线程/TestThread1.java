package 多线程;

/**
 * 创建线程方式一：继承Thread类，重写 tun() 方法，调用strat()方法 开启线程
 * 两个线程交替执行
 */
public class TestThread1 extends Thread{
    @Override
    public void run() {
        //run方法线程体
        for (int i =0;i<20;i++){
            System.out.println("我在看代码");
        }
    }
    //main 方法，主线程
    public static void main(String[] args) {

        //创建一个线程对象
        TestThread1 testThread1 = new TestThread1();

        //调用start() 方法 开启线程
        testThread1.start();


        for (int i =0;i<200;i++){
            System.out.println("我学习多线程");
        }
    }
}
