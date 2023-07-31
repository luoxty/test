package FileDemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 常见的file类方法
 */
public class FileMethods {
    public static void main(String[] args) {
        //1、查看文件属性
        File f1 = new File("D:\\weitu","11.txt");
        System.out.println("文件名"+f1.getName());
        System.out.println("路径"+f1.getPath());
        System.out.println("绝对路径"+f1.getAbsolutePath());
        System.out.println((f1.exists()?"文件存在":"文件不存在"));
        System.out.println((f1.isDirectory()?"是目录":"不是目录"));
        if (f1.canRead()){
            System.out.println("可以读取文件");
        }else {
            System.out.println("不可以读取文件");
        }
        if (f1.canWrite()){
            System.out.println("可以写入文件");
        }else {
            System.out.println("不可以写入文件");
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(f1.lastModified());
        System.out.println("该文件最后一次修改的时间是:"+ sdf.format(date));

        //2.对文件进行操作
        FileMethods fm = new FileMethods();
        File f2 = new File("D:\\weitu","111.txt");
        try {
            fm.createFile(f2);
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            fm.deleteFile(f2);
        }catch (Exception e){
            e.printStackTrace();
        }
        File dir = new File("D:\\weitu");
        // fm.listDir();



    }
    //创建文件
    public void createFile(File file) throws IOException {
        if(!file.exists()){
            file.createNewFile();
            System.out.println("创建成功");

        }

    }
    //删除文件
    public void deleteFile(File file) throws IOException{
        if (file.exists()){
            file.delete();
            System.out.println("删除文件成功");
        }

    }
    //查看目录信息
  /*  public void listDir(){
        File[] lists=dir.listFile();

        String info ="当前目录为:"+dir.getName();
        for (int i = 0;i<lists.length;i++){
            info +=lists[i].getName()+"\\";
        }
        System.out.println(info);
    }*/
}
