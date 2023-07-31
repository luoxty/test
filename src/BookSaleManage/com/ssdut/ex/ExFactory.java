package BookSaleManage.com.ssdut.ex;

public class ExFactory {
    public static EX create(int id){
        switch (id){
            case 1:
                return new Cd();
            case 2:
                return new Pen();
            case 3:
                return new Bag();
            default:
                return null;
        }
    }
}
