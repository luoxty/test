package PetDemo;
/**
 * @author Luoxty
 * @date 2023/7/2 0:00
 * @DevelopmentTool IDEA
 * @version 2021.2
 * 多态
 */


public class Test {
    public static void main(String[] args) {
        Master ms = new Master();
        // Dog dog = new Dog();

        Pet bird = new Bird();
        Pet dog = new Dog();

        ms.cure(bird);
        ms.cure(dog);

    }
}
