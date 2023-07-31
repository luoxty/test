package TryDemo;

/**
 * 自定义异常
 */
public class GenderException extends Exception{
    public GenderException(){
        super();
    }
    public GenderException(String msg){
        super(msg);
    }
    public GenderException(String msg,Throwable cause){
        super(msg,cause);
    }
}
