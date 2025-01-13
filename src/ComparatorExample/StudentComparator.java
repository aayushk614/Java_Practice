package ComparatorExample;

import java.util.*;

/**
 * The StudentComparator class demonstrates the use of a custom comparator for sorting a list of students.
 */
public class StudentComparator {

    public static void main(String[] args) {

        // Create a list of students
        List<Student> studentList = new ArrayList<>();

        // Create student objects
        Student student1 = new Student(1, "ABC");
        Student student2 = new Student(2, "BLC");
        Student student3 = new Student(3, "POQ");
        Student student4 = new Student(4, "QKM");

        // Add students to the list
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student4);
        studentList.add(student3);

        // Print the list of students
        System.out.println(studentList);
    }
}
