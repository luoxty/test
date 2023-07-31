package InterFaceDemo.HandSetPag;

/**
 * 手机类
 */
public abstract class HandSet {
    private String barnd;
    private String  type;

    public HandSet(){

    }
    public HandSet(String barnd,String type){
        this.barnd=barnd;
        this.type=type;

    }
    public abstract void call();
    public abstract void sendInfo();
    public void info(){
        System.out.println("这是一款型号为" + type + "的" + barnd +"手机");

    }

    public String getBarnd() {
        return barnd;
    }

    public void setBarnd(String barnd) {
        this.barnd = barnd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
