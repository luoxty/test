package CollectionDemo.ArrayListDemo;


import java.util.*;

public class NewTitleTest {
    public static void main(String[] args) {
        NewTitle new1 = new NewTitle(1, "开学了", "mike");
        NewTitle new2 = new NewTitle(2, "放假了", "anna");

        ArrayList newTitleList = new ArrayList();
        newTitleList.add(new1);
        newTitleList.add(new2);
        System.out.println("新闻总数" + newTitleList.size());
        for (int i = 0; i < newTitleList.size(); i++) {
            NewTitle title = (NewTitle) newTitleList.get(i);
            System.out.println(i + 1 + "新闻总数" + title.getTltleName() + "");
        }

        //使用泛型集合
        List<NewTitle> newT = new ArrayList<NewTitle>();
        newT.add(new1);
        newT.add(new2);
        System.out.println("新闻总数为:" +newT.size());
        for(int i = 0 ;i< newT.size();i++){
            NewTitle title = newT.get(i);
            System.out.println(i + 1 + "新闻总数" + title.getTltleName() + "");
        }
        //增强型for循环
        for(NewTitle title :newT){
            System.out.println(title.getTltleName());
        }

    }
}
