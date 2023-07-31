package 多线程;

/**
 * 测试 stop
 * 1.建议线程正常停止---》利用次数，不建议死循环
 * 2.建议使用标志位 ---》设置一个标志位
 * 3.不要使用stop、destory等过时或者JDK不建议使用的方法
 */
public class TestStop implements Runnable{

    //设置一个标识符
    private boolean falg;
    public static void main(String[] args) {
        TestStop testStop = new TestStop();
        new Thread(testStop).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main方法" + i);
            if(i == 900){
                //调用stop方法切换标志位，让该线程停止

                System.out.println("线程停止了");
                testStop.stop();
            }


        }
    }

    @Override
    public void run() {
        int i =0;
        while (falg){
            System.out.println("run ...... thread" + i++);
        }
    }

    //2.设置一个公开的方法停止线程，转换标志位
    public void stop(){
        this.falg=false;
    }

}
