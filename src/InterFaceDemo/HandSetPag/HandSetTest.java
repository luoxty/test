package InterFaceDemo.HandSetPag;

public class HandSetTest {
    public static void main(String[] args) {
        CommonHandSet coHandSet = new CommonHandSet("索尼","G502");
        coHandSet.info();
        coHandSet.play();
        coHandSet.sendInfo();
        coHandSet.call();
        AptitudeHandSet ahandset = new AptitudeHandSet();
        ahandset.info();
        ahandset.networkConn();
        ahandset.pic();
        ahandset.play();
        ahandset.call();
    }
}
