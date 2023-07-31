package CollectionDemo.LinedList;

import java.util.*;

public class LinedListTest {
    public static void main(String[] args) {

        NewTitle new1 = new NewTitle(1, "开学了", "mike");
        NewTitle new2 = new NewTitle(2, "放假了", "anna");

        LinkedList newTitle = new LinkedList();
        newTitle.addFirst(new1);
        newTitle.addLast(new2);

        NewTitle first = (NewTitle) newTitle.getFirst();
        NewTitle last = (NewTitle) newTitle.getLast();



    }
}
