package BookSaleManage.com.ssdut.authotity.impl;

/**
 * 顾客实现
 */

import BookSaleManage.com.ssdut.authotity.Normal;
import BookSaleManage.com.ssdut.biz.BookBiz;
import BookSaleManage.com.ssdut.entity.Book;
import BookSaleManage.com.ssdut.ex.EX;

public class DefaultCustomr implements Normal {
    BookBiz bookBiz = new BookBiz();

    //查询
    @Override
    public void query() {
        bookBiz.quety();

    }

    //购买图书
    @Override
    public Book buy(int bookid, int num) {
        return bookBiz.burBook(bookid, num);
    }


    //购买赠品
    @Override
    public EX buyEx(int excode) {
        return bookBiz.buyEx(excode);
    }

    //结账
    @Override
    public void checkout(Book book) {
        bookBiz.checkout(book);
    }
}
