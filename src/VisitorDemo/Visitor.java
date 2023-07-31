package VisitorDemo;

/**
 * @author Luoxty
 * @date 2023/6/30 22:03
 * @DevelopmentTool IDEA
 * @version 2021.2
 * 游客类
 */

public class Visitor {
    public String name;
    public int age;
    //方法，根据不同的年龄，计算不同的门票
    public void showPrice(){
        if (age < 10){
            System.out.println("门票免费");
        }else if(age <=60){
            System.out.println("门票全价");
        }else if (age > 60){
            System.out.println("门票半价");
        }
    }
}
