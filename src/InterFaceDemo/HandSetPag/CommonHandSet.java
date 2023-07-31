package InterFaceDemo.HandSetPag;

public class CommonHandSet extends HandSet implements PlayWiring {

    @Override
    public void play() {
        System.out.println("开始播放音乐");
    }

    public CommonHandSet() {
        super();
    }

    public CommonHandSet(String barnd, String type) {
        super(barnd, type);
    }

    @Override
    public void call() {
        System.out.println("开始打电话");
    }

    @Override
    public void sendInfo() {
        System.out.println("开始发短信");
    }

    @Override
    public void info() {
        super.info();
    }

    @Override
    public String getBarnd() {
        return super.getBarnd();
    }

    @Override
    public void setBarnd(String barnd) {
        super.setBarnd(barnd);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }
}
