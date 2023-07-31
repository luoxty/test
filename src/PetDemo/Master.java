package PetDemo;
/**
 *
 *
 * 主人类
 *
 */


public class Master {
  /*  public void cure(Dog dog){
        if(dog.getHealth()<50){
            System.out.println("打针吃药");
            dog.setHealth(60);
        }
    }
    public void cure(Bird bird){
        if(bird.getHealth()<50){
            System.out.println("吃药疗养");
            bird.setHealth(60);
        }
    }*/
    //这是给宠物看病的方法
    public void cure(Pet pet){
        if (pet.getHealth()<50){
            pet.toHospital();
            pet.setHealth(60);
        }
        if(pet instanceof Bird){
            Bird bird = (Bird) pet;
            bird.run();
        }else if(pet instanceof  Dog){
            Dog dog =(Dog) pet;
            dog.eat();

        }
    }


}
