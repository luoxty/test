package BookSaleManage.com.ssdut.user;
import BookSaleManage.com.ssdut.*;
import BookSaleManage.com.ssdut.authotity.impl.DefaultCustomr;
import BookSaleManage.com.ssdut.authotity.impl.DefaultStoreMgr;
import BookSaleManage.com.ssdut.entity.Book;
import BookSaleManage.com.ssdut.ex.EX;
import BookSaleManage.com.ssdut.role.Role;
import netscape.security.UserTarget;

/**
 * 用户类
 */
public class User {
    private Role role=null;//用户的角色

    //登录方法
    public Boolean login(String userName,String passWord){
        if (userName.equals(passWord)){
            if(userName.equals("admin")){
                Role storeManager = new Role();//创建一个管理员角色
                storeManager.setDescription("管理员");
                //分配权限
                DefaultStoreMgr dfStoreMgr = new DefaultStoreMgr();
                storeManager.setStoreMgr(dfStoreMgr);
                setRole(storeManager);
            }else {
                Role customer = new Role();
                customer.setDescription("顾客");
                DefaultCustomr dfCustomer = new DefaultCustomr();
                customer.setNormal(dfCustomer);
                setRole(customer);

            }
            return true;
        }
        return false;
    }
    //图书入库
    public void in(int bookid,int num){
        role.in(bookid, num);
    }
    //图书出库
    public void out(int bookid,int num){

        role.out(bookid,num);

    }

    //新增图书
    public void save( Book book){
        role.save(book);
    }

    //查看图书
    public void qeury(){
        role.query();
    }

    //结账
    public void checkout(Book book){
        role.checkout(book);
    }

    //购买图书
    public Book buy(int bookid,int num){
        return role.buy(bookid, num);
    }
    //购买赠品
    public EX buyEx(int exCode){
        return role.buyEx(exCode);
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


}
