package StaticDemo;


public class Student {
    public String name;
    public int score;
    public static int count = 0;
    public Student(String name, int score) {
        this.name = name;//就近原则 name 指方法参数
        this.score = score;
        count++;
    }

    public void showinfo() {
        System.out.println(name + "\t" + score+ "\t" +count);
    }
}