package DataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedListExample {
    public static void main(String[] args) {
        List<String> linkedlist = new LinkedList<String>();
        linkedlist.add("CEO");
        linkedlist.add("Director");
        linkedlist.add("Manager");
        linkedlist.add("Systems Admin");

        Iterator it = linkedlist.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }



}
