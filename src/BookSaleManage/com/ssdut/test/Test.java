package BookSaleManage.com.ssdut.test;

import BookSaleManage.com.ssdut.*;
import BookSaleManage.com.ssdut.biz.BookBiz;
import BookSaleManage.com.ssdut.entity.Book;
import BookSaleManage.com.ssdut.ex.EX;
import BookSaleManage.com.ssdut.user.User;

import java.util.Scanner;

public class Test {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Test test = new Test();
        User user = new User();
        System.out.println("欢迎进入书店");
        test.accrediRole(user);
        BookBiz.makeData();
        if(user.getRole().getDescription()=="管理员"){
            test.doStoreMgr(user);

        }else if(user.getRole().getDescription()=="顾客"){
            test.doCustomer(user);
        }
    }

    //角色授权
    public void accrediRole(User user) {
        System.out.println("请输入用户名:");
        String name = input.next();
        System.out.println("请输入密码");
        String passWord = input.next();
        if (user.login(name, passWord)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
            accrediRole(user);
        }

    }

    //管理员操作
    public void doStoreMgr(User user) {
        System.out.println("=========欢迎进入书店管理系统=========");
        user.qeury();
        System.out.println("请选择对应操作: 1.图书入库 2.图书出库 3.查询全部图书 4.新增图书 5.退出");
        int codeId = input.nextInt();
        try {
            switch (codeId) {
                case 1:
                    inBook(user);
                    doStoreMgr(user);
                    break;
                case 2:
                    outBook(user);
                    doStoreMgr(user);
                    break;
                case 3:
                    doStoreMgr(user);
                    break;
                case 4:
                    Book book = inputBookInfo();
                    user.save(book);
                    doStoreMgr(user);
                    break;
                case 5:
                    System.out.println("感谢使用本系统");
                    return;
                default:
                    throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("请输入正确的数字");
            doStoreMgr(user);
        }
    }

    //图书入库
    public void inBook(User user) {
        System.out.println("请输入图书信息:");
        try {
            System.out.println("请输入图书ID:");
            int bookid = input.nextInt();
            System.out.println("请输入入库图书数量:");
            int num = input.nextInt();//入库
            user.in(bookid, num);
        } catch (Exception e) {
            System.out.println("请输入正确的数字格式:1-5");
            inBook(user);
        }
    }

    //图书出库
    public void outBook(User user) {
        System.out.println("请输入图书信息:");
        try {
            System.out.println("请输入图书ID:");
            int bookid = input.nextInt();
            System.out.println("请输入出库图书数量:");
            int num = input.nextInt();//出库
            user.out(bookid, num);
        } catch (Exception e) {
            System.out.println("请输入正确的数字格式:1-5");
            outBook(user);
        }
    }

    //录入图书信息
    public Book inputBookInfo() {
        Scanner input2 = new Scanner(System.in);
        Book book = new Book();
        System.out.println("请输入图书信息:");
        try {
            System.out.println("请输入书名:");
            String name = input2.next();
            System.out.println("请输入作者:");
            String auther = input2.next();
            System.out.println("请输入出版时间:");
            String pubDate = input2.next();
            System.out.println("请输入价格");
            double price = input2.nextDouble();
            System.out.println("请输入数量:");
            int store = input2.nextInt();
            book.setName(name);
            book.setAuther(auther);
            book.setPubDate(pubDate);
            book.setPrice(price);
            book.setStore(store);

        } catch (Exception e) {
            System.out.println("请输入正确格式");
            inputBookInfo();
        }
        return book;
    }

    //顾客操作
    public void doCustomer(User user) {
        Scanner input3 = new Scanner(System.in);
        System.out.println("=========欢迎进入书店管理系统=========");
        user.qeury();
        System.out.println("请选择对应操作: 1.查看图书 2.结账 3.退出");
        try {
            int codeId = input3.nextInt();
            switch (codeId) {
                case 1:
                    doCustomer(user);
                    break;
                case 2:
                    buyBook(user);
                    doCustomer(user);
                    break;
                case 3:
                    System.out.println("欢迎光临，再见");
                    return;
                default:
                    throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("请输入正确的格式");
            doCustomer(user);
        }
    }

    //购买图书
    public void buyBook(User user) {
        Book book = null;
        System.out.println("请输入你要购买的书籍ID:");
        try {
            int bookid = input.nextInt();
            System.out.println("请输入你要购买图书的数量:");
            int num = input.nextInt();
            book = user.buy(bookid, num);
        } catch (Exception e) {
            System.out.println("请输入正确的格式");
            outBook(user);
        }
        if (book != null) {
            while (true) {
                try {
                    System.out.println("赠品 1.CD 2.包装 3.钢笔 4.不需要 ，请输入相应的数字进行赠品的购买");
                    int exCode = input.nextInt();
                    if (exCode >= 1 && exCode <= 4) {
                        EX ex = user.buyEx(exCode);
                        book.setEx(ex);
                        user.checkout(book);
                        return;
                    }
                    System.out.println("请输入1-4之间的数字");
                } catch (Exception e) {
                    System.out.println("请输入正确的格式");
                }
            }
        }

    }
}
