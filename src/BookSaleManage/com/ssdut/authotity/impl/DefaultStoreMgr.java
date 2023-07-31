package BookSaleManage.com.ssdut.authotity.impl;

import BookSaleManage.com.ssdut.authotity.StoreMgr;
import BookSaleManage.com.ssdut.biz.BookBiz;
import BookSaleManage.com.ssdut.entity.Book;

public class DefaultStoreMgr implements StoreMgr {
    BookBiz bookBiz = new BookBiz();

    @Override
    public void in(int bookid, int num) {
        bookBiz.inBook(bookid, num);

    }

    @Override
    public void out(int bookid, int num) {
        bookBiz.outBook(bookid, num);
    }

    @Override
    public void save(Book book) {
        bookBiz.saveBook(book);
    }

    @Override
    public void query() {
        bookBiz.quety();
    }
}
