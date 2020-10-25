package DataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseIteratorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(34);
        list.add(43);
        list.add(1);

        Iterator it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        List<String> listString = new ArrayList<String>();
        listString.add("Pineapple");
        listString.add("Apple");
        listString.add("Banana");
        listString.add("Orange");

        Iterator fruits = listString.listIterator();
        while(fruits.hasNext()){
            System.out.println(fruits.next());
        }

        List<Student> listStudent = new ArrayList<Student>();
        listStudent.add(new Student(101, "Adam G", "11-13-1989"));
        listStudent.add(new Student(102, "Carmen C", "12-13-1979"));
        listStudent.add(new Student(103, "Edwin R", "09-23-1995"));
        //^coming from student class

        Iterator stu = listStudent.listIterator();
        while(stu.hasNext()){
            Student examples = (Student)stu.next();
            //System.out.println(stu.next());
        //why cant we print out data?
            System.out.println(examples.getStId() + " " + examples.getStName()+ " " + examples.getStDob());
        }
    }


}
