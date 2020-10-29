package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class UseForEachLoop {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("Bronx");
        ls.add("Queens");
        ls.add("Manhattan");
        ls.add("Brooklyn");

        List<Integer> number = new ArrayList<Integer>();
        number.add(102);
        number.add(103);
        number.add(104);
        number.add(105);

        for(int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i));
            //for loop

            for (Integer sg:number) {
                System.out.println(sg);
                //for eachloop
            }
        }

    }
}
