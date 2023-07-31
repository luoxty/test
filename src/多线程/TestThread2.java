package 多线程;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 */
public class TestThread2 extends Thread {
    public String url;
    public String name;

    public TestThread2(String url, String name) {
        this.url = url;
        this.name = name;


    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println(name);
    }

    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("https://img1.baidu.com/it/u=247482182,2950584235&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=708", "t1.jpg");
        TestThread2 t2 = new TestThread2("https://img1.baidu.com/it/u=247482182,2950584235&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=708", "t2.jpg");
        TestThread2 t3 = new TestThread2("https://img1.baidu.com/it/u=247482182,2950584235&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=708", "t3.jpg");

        t1.start();
        t2.start();
        t3.start();
    }
}

//下载器
class WebDownloader {
    public void downloader(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("I/O错误");
        }
    }
}
