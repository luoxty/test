package FileDemo;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            String str = "好好学习 天天向上";
            byte[] worsd = str.getBytes();//getBytes 将字符串转换成字节
            FileOutputStream fos = new FileOutputStream("D:\\weitu\\11.txt");
            fos.write(worsd,0,worsd.length);//覆盖原文本
            System.out.println("文件已更新");
            fos.close();
        }catch (IOException e){
            System.out.println("文件更新出错");

        }
    }

}
