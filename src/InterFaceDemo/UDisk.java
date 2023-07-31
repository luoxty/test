package InterFaceDemo;

/**
 * U盘
 */
public class UDisk implements UsbInterface{
    @Override
    public void service() {
        System.out.println("连接USB接口，实现传输数据");
    }
}
