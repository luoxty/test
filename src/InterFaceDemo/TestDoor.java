package InterFaceDemo;

public class TestDoor {
    public static void main(String[] args) {
        TheftproofDoor tfd = new TheftproofDoor();
        tfd.close();
        tfd.open();
        tfd.lockUp();
        tfd.openLock();
        tfd.takePicture();
    }
}
