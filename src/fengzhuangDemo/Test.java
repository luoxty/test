package fengzhuangDemo;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Person p1 = new Person("mike",30);
        p1.showInfo();
        p.setName("Bob");
        p.setAge(20);
        p.showInfo();

    }
}
