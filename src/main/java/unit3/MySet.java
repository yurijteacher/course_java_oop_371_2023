package unit3;

import java.util.HashSet;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);

        set.add(1);
        System.out.println(set);

        set.add(4);

        System.out.println(set);

        set.remove(1);

        System.out.println(set);


        Set<Student> students = new HashSet<>();

        students.add(new Student(1L, "Vasya", "Pypkin",20));
        students.add(new Student(2L, "Iva", "Pypkin",16));
        students.add(new Student(3L, "Ivan", "Pyp",18));

        students.add(new Student(4L, "Vasya", "Pypkin",20));

        System.out.println(students);


    }

}
