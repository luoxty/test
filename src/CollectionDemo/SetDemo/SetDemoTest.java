package CollectionDemo.SetDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemoTest {
    public static void main(String[] args) {
        NewTitle new1 = new NewTitle(1, "开学了", "mike");
        NewTitle new2 = new NewTitle(2, "放假了", "anna");

        Set newMAp = new HashSet();

        newMAp.add(new1);
        newMAp.add(new2);

//通过迭代器 Iterator实现遍历
        Iterator it = newMAp.iterator();
        while(it.hasNext()){
            NewTitle title = (NewTitle) it.next();
            System.out.println(title.getTltleName());
        }



    }
}
