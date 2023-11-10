package ComparatorExample;

import java.util.*;

public class StudentComparator {

    public static void main(String[] args) {

        //Set<Student> set = new HashSet<>();
        List<Student> list = new ArrayList<>();

        Student ob1 = new Student(1,"ABC");
        Student ob2 = new Student(2,"BLC");
        Student ob3 = new Student(3,"POQ");
        Student ob4 = new Student(4,"QKM");

        list.add(ob1);
        list.add(ob2);
        list.add(ob4);
        list.add(ob3);



        System.out.println(list);





    }
}
