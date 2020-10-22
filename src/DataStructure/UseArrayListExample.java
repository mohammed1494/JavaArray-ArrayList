package DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseArrayListExample {
    public static void main(String[] args) {

        System.out.println("Please enter Array limit ");
        Scanner arraylimit = new Scanner(System.in);
        int limit = arraylimit.nextInt();
        System.out.println("Please enter some numbers ");
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        for(int control=0; control<limit; control++){
            list.add(sc.nextInt());
        }
            for(int i=0; i<list.size(); i++){
                System.out.println(list.get(i));

        //must have integer. ArrayList is a class. List is interface is implemented by ArrayList
//       for(int j=0; j<sc.nextInt(); j++){
//           list.add()
       }


//        list.add(10);
//        list.add(30);
//        list.add(15);
//        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
            //System.out.println(list.get(1));
            //need to use get so it can fetch the data
        }
    }

