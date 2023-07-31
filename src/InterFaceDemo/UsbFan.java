package InterFaceDemo;

public class UsbFan implements UsbInterface{
    @Override
    public void service() {
        System.out.println("连接USB接口，电风扇转起来");
    }
}
