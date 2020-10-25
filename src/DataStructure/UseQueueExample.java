package DataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueueExample {
    public static void main(String[] args) {
        Queue<String> example = new LinkedList<String>();
        //implements linkedlist only
        //FIFO & LILO
        example.add("Nasir");
        example.add("Hussain");
        example.add("Mo");

        Iterator que = example.iterator();
        while (que.hasNext()){
            System.out.println(que.next());
        }
    }
}


