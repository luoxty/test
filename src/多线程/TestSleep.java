package 多线程;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 模拟倒计时
 */
public class TestSleep {
    public static void main(String[] args) {
        //打印系统当前时间
        Date startTime = new Date(System.currentTimeMillis());
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
                startTime = new Date(System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
       /*     try {
                tenDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        public static void tenDown () throws InterruptedException {
            int num = 10;
            while (true) {
                Thread.sleep(1000);
                System.out.println(num--);
                if (num < 0) {
                    break;
                }
            }

        }*/
    }}
