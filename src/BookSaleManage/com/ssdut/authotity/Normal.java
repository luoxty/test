package BookSaleManage.com.ssdut.authotity;

import BookSaleManage.com.ssdut.entity.Book;
import BookSaleManage.com.ssdut.ex.EX;

public interface Normal {
    public void query();
    public Book buy(int id,int num);//购买图书
    public EX buyEx(int excode);//购买赠品
    public void checkout(Book book);//结账

}
