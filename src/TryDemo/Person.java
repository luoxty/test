package TryDemo;

public class Person {
    private String name;
    private String sex;
    private int age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }
    //程序员自行抛出异常
    public void setSex(String sex) throws GenderException{
        if ("男".equals(sex) || "女".equals(sex)){
            this.sex = sex;

        }else {
            throw new GenderException("性别必须时’男‘或者’女‘");
        }

}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print(){
        System.out.println(this.name+this.sex+this.age);
    }}
