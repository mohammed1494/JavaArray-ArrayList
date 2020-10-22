package DataStructure;

import java.util.Scanner;

public class UseArrayLimitExample {


    public static void main(String[] args) {

        System.out.println("Please enter size of array");
        Scanner limitex= new Scanner(System.in);
        int limit = limitex.nextInt();
        int[] number = new int[limit];
        Scanner numberex = new Scanner(System.in);
        System.out.println("Please enter your limit numbers");
        for (int j = 0; j < number.length; j++) {
            number[j] = numberex.nextInt();
        }
    }
}
