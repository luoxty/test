package FileDemo;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("D:\\weitu\\11.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("长亭外");
            bw.write("古道边");
            bw.newLine();
            bw.write("芳草碧连天");
            bw.flush();
            bw.close();

            FileReader fr = new FileReader("D:\\weitu\\11.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("文件读取出错");
        }
    }

}
