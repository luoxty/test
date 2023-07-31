package InterFaceDemo;

public class TheftproofDoor extends  Door implements Lock,DoorBell{
    @Override
    public void open() {
        System.out.println("用力推门就开了");
    }

    @Override
    public void close() {
        System.out.println("轻轻一拉就关上了");
    }

    @Override
    public void lockUp() {
        System.out.println("插进钥匙，锁上门，拔出钥匙");
    }

    @Override
    public void openLock() {
        System.out.println("插进钥匙，打开了，拔出钥匙");

    }

    @Override
    public void takePicture() {
        System.out.println("拍照，存档");
    }
}
