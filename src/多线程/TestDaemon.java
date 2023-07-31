package 多线程;

/**
 * 守护线程
 */
public class TestDaemon {
    public static void main(String[] args) {
        God god = new God();
        You you = new You();
        Thread thread = new Thread(god);
        thread.setDaemon(true);//默认值false，表示是用户线程，正常的线程都是用户线程
        thread.start();//上帝线程启动
        new Thread(you).start();//你，线程启动
    }
}
//上帝
class God implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("上帝保佑你");
        }
    }
}
//你
class You implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("开心的活着");
        }
        System.out.println("========goodbye! word===========");
    }
}
