package BookSaleManage.com.ssdut.entity;
import BookSaleManage.com.ssdut.ex.EX;
public class Book {
    private int id;
    private String name;
    private String auther;
    private String pubDate;
    private int store;
    private double price;
    private int num;
    private EX ex;// 内部类

    //计算价钱
    public  double cost(){
        System.out.println(this.getName()+this.getPrice()+this.num);
        System.out.println("小计:" + this.getPrice()*this.getPrice());
        System.out.println("=======================================");
        if (ex==null){
            return price*num;
        }else {
            return price*num + ex.cost();
        }
    }


    public EX getEx() {
        return ex;
    }

    public void setEx(EX ex) {
        this.ex = ex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
