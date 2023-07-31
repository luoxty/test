package 多线程;

/**
 * 推导 Lambda表达式
 */
public class TestLamda1{
    public static void main(String[] args) {
        Like like = () -> {
            System.out.println("like");
        };
        like.lambda();
    }
}
interface Like{
    public void lambda();
}

