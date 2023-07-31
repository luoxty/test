package PetDemo;
/**
 * 狗狗类
 */

public class Dog extends Pet{
    @Override
    public void toHospital() {
        System.out.println("打针吃药");

    }
    public void eat(){
        System.out.println("吃肉");
    }
}
