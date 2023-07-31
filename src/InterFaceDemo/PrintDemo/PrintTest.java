package InterFaceDemo.PrintDemo;

public class PrintTest {
    public static void main(String[] args) {
        InkBox ibx = null;
        Paper pa =null;
        Printer printer = new Printer();

        ibx = new GrayInkBox();
        pa = new A4Paper();

        printer.setInlBox(ibx);
        printer.setPaper(pa);
        printer.printFun();
    }

}
