package VisitorDemo;

import javax.sql.rowset.serial.SerialStruct;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer  = "";
        do {
            Visitor v1 = new Visitor();
            System.out.println("请输入你的姓名:");
            v1.name= input.next();
            System.out.println("请输入你的年龄:");
            v1.age = input.nextInt();
            v1.showPrice();
            System.out.println("是否继续(y/n):");
            answer = input.next();
        }while (answer.equals("y"));
    }
}
