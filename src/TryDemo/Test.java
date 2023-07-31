package TryDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setSex("mile");
        }catch (GenderException e){
                e.printStackTrace();
        }


        try {
            divide();
        } catch (Exception e) {
            System.err.println("其它位置异常");
            e.printStackTrace();
        } finally {
            System.out.println("感谢使用本程序");
        }
    }

    public static void divide() throws ArithmeticException,Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("输入被除数:");
        int num1 = in.nextInt();
        System.out.println("输入除数:");
        int num2 = in.nextInt();
        //计算两个数的值
        System.out.println(num1 + "/" + num2 + "=" + num1 / num2);

    }
}
