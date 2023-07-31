package BookSaleManage.com.ssdut.biz;
import BookSaleManage.com.ssdut.*;
import BookSaleManage.com.ssdut.entity.Book;
import BookSaleManage.com.ssdut.ex.EX;
import BookSaleManage.com.ssdut.ex.ExFactory;

public class BookBiz {
    public static Book[] books = new Book[30];//图书书架
    //初始化图书
    public static  void makeData(){
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        Book book5 = new Book();

        book1.setId(1);
        book1.setName("数据库系统概念");
        book1.setAuther("西尔伯沙茨");
        book1.setPubDate("2012-05-01");
        book1.setPrice(99.00);
        book1.setStore(76);

        book2.setId(2);
        book2.setName("Python深度学习");
        book2.setAuther("尼格尔·刘易斯");
        book2.setPubDate("2018-01-01");
        book2.setPrice(29.5);
        book2.setStore(18);

        book3.setId(3);
        book3.setName("深入浅出数据分析");
        book3.setAuther("迈克尔·米斯顿");
        book3.setPubDate("2012-10-01");
        book3.setPrice(69.50);
        book3.setStore(80);

        book4.setId(4);
        book4.setName("Python");
        book4.setAuther("卫斯理·春");
        book4.setPubDate("2016-05-24");
        book4.setPrice(7802);
        book4.setStore(55);

        book5.setId(5);
        book5.setName("成为数据分析师");
        book5.setAuther("托马斯·达文波特");
        book5.setPubDate("2018-02-01");
        book5.setPrice(47.00);
        book5.setStore(22);

        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;

    }

    //图书入库
    public void inBook(int bookid,int num){
        Book book = findBookId(bookid);
        if(book ==null){
            System.out.println("没有此Id的图书，请选择新增图书");
            return;
        }else {
            book.setStore(book.getStore()+num);//修改图书数量
        }

    }

    private Book findBookId(int bookid) {
        for (int i = 0;i<books.length;i++){
            if (books[i] == null){
                return null;
            }
            if (bookid ==books[i].getId()){
                return books[i];
            }
        }
    return null;
    }

    //图书出库
    public void outBook(int bookid,int num){
        Book book = findBookId(bookid);
        if(book==null){
            System.out.println("库存不足，请确定");
        }else {
            book.setStore(book.getStore()-num);//修改图书数量

        }

    }

    //查询图书
    public void quety(){
        System.out.println("书号\t\t 书名\t\t作者\t\t发布日期\t\t价格\t\t库存");
        for (int  i=0;i< books.length;i++){
            Book temp = books[i];
            if (temp ==null){
                break;
            }else {
                int id = temp.getId();
                String name = temp.getName();
                String auther = temp.getAuther();
                String pubdata =temp.getPubDate();
                double price = temp.getPrice();
                int store= temp.getStore();
                System.out.println(id+"\t\t"+name+"\t\t"+auther+"\t\t"+pubdata+"\t\t"+price+"\t\t"+store);
            }
        }
    }
    //购买图书
    public Book burBook(int bookid,int num){
        Book book=findBookId(bookid);
        if (book==null){
            System.out.println("此书不存在，请确认");
            return null;
        }else {
            for (int i=0 ;i<books.length;i++){
                if(bookid == books[i].getId()){
                    if (books[i].getStore()<num){
                        System.out.println("此书库存不足，请确认");
                    }else {
                        books[i].setNum(num);//设置购买数量
                        return books[i];
                    }
                }
            }

        }
        return null;
    }

    //购买赠品
    public EX buyEx(int exCode) {
        return ExFactory.create(exCode);
    }

    //结账
    public void checkout(Book book){
        book.setStore(book.getStore()-book.getNum());//减少数量
        double price = book.cost();//计算价格
        System.out.println("总价格为:"+price);

    }
    //新增图书
    public void saveBook(Book book){
       for (int i =0;i<books.length;i++){
           if (books[i] ==null) {
            int newId = books[i-1].getId();
            books[i].setId(newId);
            break;
           }
       }

    }
}
