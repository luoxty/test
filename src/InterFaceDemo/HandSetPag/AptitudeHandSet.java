package InterFaceDemo.HandSetPag;

public class AptitudeHandSet extends HandSet implements NetWork,PlayWiring,TAlePicture{

    public AptitudeHandSet() {
        super();
    }

    public AptitudeHandSet(String barnd, String type) {
        super(barnd, type);
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

    @Override
    public void call() {

    }

    @Override
    public void sendInfo() {

    }

    @Override
    public void networkConn() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pic() {

    }
}
