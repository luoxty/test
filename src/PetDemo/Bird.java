package PetDemo;
/**
 * 小鸟类
 *
 *
 *
 */

public class Bird extends Pet{
    @Override
    public void toHospital() {
        System.out.println("吃药疗养");
    }
    public void  run(){
        System.out.println("奔跑");
    }
}
