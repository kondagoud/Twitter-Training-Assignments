package com.sid.twitter.main;

import com.sid.implementation.SortOperationsManager;
import com.sid.model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * This class contains main method to perform sort operations.
 *
 * @author kmerugu.
 */
public class SortApplication {
    /**
     * This is the main method which is used to perform sort operations.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        //Creating new student list.
//        List<Student> studentList = new ArrayList<Student>();

//        //Adding students to the list.
//        studentList.add(new Student(10L, "James"));
//        studentList.add(new Student(2L, "Robert"));
//        studentList.add(new Student(40L, "Philips"));
//        studentList.add(new Student(16L, "Salt"));
        //This comparator compare the students based on their names.

        Comparator<Student> nameComparator = (Student student1, Student student2) ->
                student1.getName().compareTo(student2.getName());

        //This comparator compare the students based on their roll numbers.
        Comparator<Student> rollNumberComparator = (Student student1, Student student2) ->
                student1.getRollNumber().compareTo(student2.getRollNumber());

        //Sort students based on their roll number.
//       List<Student> sortedList = SortOperationsManager.getSortedList(studentList, rollNumberComparator);
//       SortOperationsManager.displaySortedElements(sortedList);


        //Sorting of string objects.
        List<String> elementList = new ArrayList<>();
        elementList.add("85");
        elementList.add("3");
        elementList.add("-1");
        List<String> sortedList = SortOperationsManager.getSortedList(elementList, Comparator.naturalOrder());
        SortOperationsManager.displaySortedElements(sortedList);

        //Sorting of integers
//        List<Integer> elementList = new ArrayList<>();
//        elementList.add(20);
//        elementList.add(40);
//        elementList.add(10);
//        List<Integer> sortedList = SortOperationsManager.getSortedList(elementList, Comparator.naturalOrder());
//        SortOperationsManager.displaySortedElements(sortedList);
    }

    public static void add(int a, int b){
        sum(11, 12);
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }
}
