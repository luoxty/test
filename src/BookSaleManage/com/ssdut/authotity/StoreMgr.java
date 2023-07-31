package BookSaleManage.com.ssdut.authotity;

import BookSaleManage.com.ssdut.entity.Book;

/**
 * 管理员权限
 */
public interface StoreMgr {
    public void in(int bookid,int num);
    public void out(int bookid,int num);
    public void save(Book book);
    public void query();
}
