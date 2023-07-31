package StrutMethod;

import javafx.beans.binding.BooleanBinding;

/**
 * @author Luoxty
 * @date 2023/6/30 22:27
 * @DevelopmentTool IDEA
 * @version 2021.2
 * 构造方法
 */

public class Student {
    public String name;
    public int score;
    public Student(String name,int score){
        this.name = name;//就近原则 name 指方法参数
        this.score = score;
    };
    public Student(int score){
        this.name = "Bob";//就近原则 name 指方法参数
        this.score = score;
    };
    public void showinfo(){
        System.out.println(name + "\t" + score);
    }

}
