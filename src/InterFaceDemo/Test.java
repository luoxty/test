package InterFaceDemo;

public class Test {
    public static void main(String[] args) {
        UsbInterface uDisk = new UDisk();
        UsbInterface usbFan = new UsbFan();
        uDisk.service();
        usbFan.service();
    }
}
