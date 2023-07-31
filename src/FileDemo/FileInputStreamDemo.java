package FileDemo;
import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("D:\\weitu\\11.txt");
        int data ;
        System.out.println("可读取的字节数:"+fis.available());
        System.out.println("文件内容为:");
        //字节
      /*  while ((data=fis.read())!=-1){
            System.out.print(data +" ");

        }*/
        //字符
        while ((data=fis.read())!=-1){
            System.out.print((char) data +" ");

        }
        fis.close();

    }
}
