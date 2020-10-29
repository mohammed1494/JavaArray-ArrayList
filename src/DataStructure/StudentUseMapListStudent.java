package DataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentUseMapListStudent {
    public static void main(String[] args) {

        List<Student> mathCourseStudents = new ArrayList<Student>();
        //syntax for ArrayList
        mathCourseStudents.add(new Student(101, "Jon Doe", "10-28-2020"));
        mathCourseStudents.add(new Student(102, "Jaane Doe", "11-09-2009"));
        mathCourseStudents.add(new Student(103, "David Doe", "08-28-1989"));


        List<Student> computerCourseStudents = new ArrayList<Student>();
        //syntax for ArrayList
        computerCourseStudents.add(new Student(104, "Tony Parker", "05-03-1995"));
        computerCourseStudents.add(new Student(105, "Sasha Williams", "11-12-2002"));
        computerCourseStudents.add(new Student(106, "Davon Willis", "08-22-1956"));


        Map<Integer, List<Student>> studentList = new HashMap<Integer, List<Student>>();
        //syntax for hashmap not in order
        studentList.put(1, mathCourseStudents);
        studentList.put(2, computerCourseStudents);

        for(Map.Entry<Integer, List<Student>> stu:studentList.entrySet()) {
            //outerloop
            for (int i = 0; i < stu.getValue().size(); i++) {
                //innerloop
                System.out.println("Course Number " + stu.getKey() + " --> " + stu.getValue().get(i).getStId() + " "
                                                                             + stu.getValue().get(i).getStName() + " "
                                                                             + stu.getValue().get(i).getStDob());
                //Syntax for println in order forEachLoop also a nestedLoop
            }
        }

    }
}
