package DataStructure;

import java.util.Stack;

public class UseStackExample {

    public static void main(String[] args) {
        Stack<String> stackex = new Stack<>();
        stackex.push("Person 1");
        stackex.push("Person 2");
        stackex.push("Person 3");
        stackex.push("Person 4");
        stackex.push("Person 5");
        //First In Last Out && Last In First Out
        for(int i= stackex.size(); i>0; i--){
            System.out.println("Peek Element: " + stackex.peek());
            System.out.println(stackex.pop());
        }

        


    }
}
