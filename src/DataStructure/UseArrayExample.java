package DataStructure;

public class UseArrayExample {
    public static void main(String[] args) {
        //int [] number = {10, 32,0, 43, 31, 69,89,};
        //^ syntax for array and is initialize in same line
        int [] number = new int [7];
        number[0] = 10;
        number[1] = 123;
        number[3] = 45;
        number[6] = 76;
        //^syntax for array, number is name of variable
        //^ storing array into each index
//        System.out.println(number[0]);
//        System.out.println(number[1]);
//        System.out.println(number[3] + " " + number[5]);
//        System.out.println(number[2]);
        //[0] [1] [3]  returns value stored in index
        //[2] returns 0 because nothing is stored in index 2
        for(int i=0; i<number.length; i++)
            //number.length prevents errors. variable Number.length will get updated automatically based on int [size]
        //for(int i=0; i<7; i++){
            //syntax using for loop container size is 7 index sz is 6
           System.out.println(number[i]);
        }
    }


