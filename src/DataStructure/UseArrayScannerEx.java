package DataStructure;

import java.util.Scanner;

public class UseArrayScannerEx {

    public static void main(String[] args) {
        int[] number = new int[5];
        Scanner numberex = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        for (int j = 0; j < number.length; j++) {
            number[j] = numberex.nextInt();
        }
    }
}
        //for (int i = 0; i < number.length; i++) {
            //number.length prevents errors. variable Number.length will get updated automatically based on int [size]
            //for(int i=0; i<7; i++){
            //syntax using for loop container size is 7 index sz is 6
           // System.out.println(number[j]);
//        }
//    }
//}




