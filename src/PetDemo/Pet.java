package PetDemo;
/**
 * @author Luoxty
 * @date 2023/7/1 23:46
 * @DevelopmentTool IDEA
 * @version 2021.2
 *
 * 宠物类（抽象类）
 *  1.抽象类不能被实例化
 *  2.抽象类里面必须有抽象方法
 *  3.抽象类中的抽象方法必须被派生类实现
 */

public abstract class Pet {
    private String name;
    private String sex;
    private int health;

    public  abstract  void  toHospital();//宠物看病

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
