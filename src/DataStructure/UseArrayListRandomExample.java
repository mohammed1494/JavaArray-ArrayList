package DataStructure;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UseArrayListRandomExample {

    public static void main(String[] args) {
        int limit = 5;
        Random randomNumbers = new Random();
        List<Integer> list = new ArrayList<Integer>();
        //^ ArrayList syntax
        for (int control = 0; control < limit; control++) {
            list.add(randomNumbers.nextInt(90));
            System.out.println(list.get(control));
        }
    }
}

