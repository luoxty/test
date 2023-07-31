package BookSaleManage.com.ssdut.ex;

public abstract class EX {
    private double price;
    private String exName;


    public double cost() {
        System.out.println("附赠品:");
        System.out.println(exName + ":" + price);
        System.out.println("===================");
        return price;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExName() {
        return exName;
    }

    public void setExName(String exName) {
        this.exName = exName;
    }
}
