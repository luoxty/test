package 多线程;
 
public class Race implements Runnable {
    private static String winner;

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race, "兔子").start();
        new Thread(race, "乌龟").start();
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + "--跑了" + i + "步");
            boolean falg = gamevoer(i);
            if (falg) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "--跑了" + i + "步");
        }
    }

    private boolean gamevoer(int step) {
        if (winner !=null) {
            return true;
        }{
            if(step ==100){
                winner = Thread.currentThread().getName();
                System.out.println("winner is"+winner);
                return true;
            }
        }
        return false;
    }
}
