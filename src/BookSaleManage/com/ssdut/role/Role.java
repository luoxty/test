package BookSaleManage.com.ssdut.role;
import BookSaleManage.com.ssdut.*;
import BookSaleManage.com.ssdut.authotity.Normal;
import BookSaleManage.com.ssdut.authotity.StoreMgr;
import BookSaleManage.com.ssdut.entity.Book;
import BookSaleManage.com.ssdut.ex.EX;

/**
 * 角色类
 */
public class Role {
    private String description;//角色名
    private StoreMgr storeMgr =null;//管理员权限
    private Normal normal = null;//顾客权限
    //入库方法
    public void in(int bookid,int num){
        if(storeMgr == null){
            System.out.println("您没有管理员权限");
            return;
        }else {
            storeMgr.in(bookid, num);
        }
    }
    //出库方法
    public void out(int bookid,int num){
        if(storeMgr == null){
            System.out.println("您没有管理员权限");
            return;
        }else {
            storeMgr.out(bookid, num);
        }
    }
    //新增图书方法
    public void save(Book book){
        if(storeMgr == null){
            System.out.println("您没有管理员权限");
            return;
        }else {
            storeMgr.save(book);
        }
    }

    //查询图书
    public void query(){
        if (storeMgr == null && normal == null){
            System.out.println("您没有登录，不能查询图书");
            return;
        }else if(normal !=null){
            normal.query();
        }else {
            storeMgr.query();
        }
    }

    //购买图书
    public Book buy(int bookid,int num){
        if(normal == null){
            System.out.println("您没有登录，不能执行此操作");
            return null;
        }else {
           return normal.buy(bookid,num);
        }
    }

    //购买赠品
    public EX buyEx(int excode){
        if(normal == null){
            System.out.println("您没有登录，不能执行此操作");
            return null;
        }else {
            normal.buyEx(excode);
        }
        return null;
    }

    //结账
    public void checkout(Book book){
        if(normal == null){
            System.out.println("您没有登录，不能执行此操作");
            return;
        }else {
            normal.checkout(book);
        }
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StoreMgr getStoreMgr() {
        return storeMgr;
    }

    public void setStoreMgr(StoreMgr storeMgr) {
        this.storeMgr = storeMgr;
    }

    public Normal getNormal() {
        return normal;
    }

    public void setNormal(Normal normal) {
        this.normal = normal;
    }
}
