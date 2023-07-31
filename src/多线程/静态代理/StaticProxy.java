package 多线程.静态代理;

/**
 * 真实对象的代理对象都要实现一个接口
 * 代理对象要代理真实角色
 *
 * 好处：
 *  代理对象可以做很多真实对象做不了的事
 */
public class StaticProxy {
    public static void main(String[] args) {
        WeddingCompany weddingCompany = new WeddingCompany(new You());
        weddingCompany.HappyMarry();
    }
}
interface Marry{
    void HappyMarry();
}
//真实角色
class You implements Marry{
    @Override
    public void HappyMarry() {
        System.out.println("结婚");
    }
}
//代理角色
class WeddingCompany implements Marry{
    private Marry target;
    public WeddingCompany(Marry target){
        this.target=target;
    }
    @Override
    public void HappyMarry() {
    before();
    this.target.HappyMarry();
    after();
    }
    private void before(){
        System.out.println("结婚前");
    }
    private void after(){
        System.out.println("结婚后");
    }
        }
