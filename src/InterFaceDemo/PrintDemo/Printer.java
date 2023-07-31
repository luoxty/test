package InterFaceDemo.PrintDemo;

public class Printer {
    InkBox ibx;
    Paper pa;
    public void setInlBox(InkBox ibx){
        this.ibx = ibx;
    }
    public void setPaper(Paper pa){
        this.pa = pa;
    }
    public void printFun(){
        System.out.println("使用"+ibx.getColor()+"墨盒，在" + pa.getSize()+ "纸张上进行打印");
    }

}
