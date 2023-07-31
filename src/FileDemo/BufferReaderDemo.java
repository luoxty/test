package FileDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:\\weitu\\11.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line!=null){
                System.out.println(line);
                line=br.readLine();
            }
            br.close();
            fr.close();
        }catch (IOException e){
            System.out.println("文件读取出错");
        }
    }

}
