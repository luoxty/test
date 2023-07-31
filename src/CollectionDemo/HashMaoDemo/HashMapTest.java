package CollectionDemo.HashMaoDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        NewTitle new1 = new NewTitle(1,"开学了","mike");
        NewTitle new2 = new NewTitle(2,"放假了","anna");

        HashMap newMap = new HashMap();

        newMap.put("mike", new1);
        newMap.put("anna", new2);

        System.out.println("键集:" + newMap.keySet());
        System.out.println("值集:" + newMap.values());
        System.out.println("键-值对集合:" + newMap);

        if(newMap.containsKey("mike")){
            NewTitle newTitle= (NewTitle) newMap.get("mike");
            System.out.println("新闻表题:" + newTitle.getTltleName());
        }

        //通过迭代器 Iterator实现遍历
      /*  Set keys = newMap.keySet();
        Iterator it = keys.iterator();
        while (it.hasNext()){
            String key = (String) it.next();
            NewTitle title = (NewTitle) newMap.get(key);
            System.out.println(key + title.getTltleName());
        }*/

        //增强 for 循环
        Set keys = newMap.keySet();
        for(Object key :keys){
            NewTitle title = (NewTitle) newMap.get(key);
            System.out.println(key + title.getTltleName());
        }


    }
}
