package unit3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyList {

    public static void main(String[] args) {

        List list = List.of(1,2,3,4);

        System.out.println(list);

//        list.add(5);

        System.out.println(list);


        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1);

        list1.add(5);
        System.out.println(list1);

        list1.add(0,0);

        System.out.println(list1);

        list1.set(1, 10);

        System.out.println(list1);

        list1.remove(1);

        System.out.println(list1);

        list1.add(2);

        System.out.println(list1);

        System.out.println(list1.get(1));

        list1.clear();

        System.out.println(list1);


        List<Student> students = new ArrayList<>();

        students.add(new Student(1L, "Vasya", "Pypkin",20));
        students.add(new Student(2L, "Iva", "Pypkinа",16));
        students.add(new Student(3L, "Ivan", "Pyp",18));

        //        students.add(new Student(4L, "Vasya", "Pypkin",20));


        List<Student> students1 = students
                .stream()
                .sorted(Comparator
                        .comparing(Student::getAge))
                .collect(Collectors.toList());

        students1
                .stream()
                .forEach(e->{
            System.out.println(e);
        });

        students1
                .stream()
                .forEach(System.out::println);

        //System.out.println(students);

        Student student =  students.stream().min(Comparator.comparing(Student::getAge)).get();

        System.out.println(student);

        String firstName =  students
                .stream()
                .max(Comparator.comparing(Student::getAge))
                .get()
                .getFirstName();

        System.out.println(firstName);


        students.stream().filter(el->(el.getAge()>17)).forEach(e->{
            System.out.println(e);
        });

        for (Student el : students
             ) {
            System.out.println(el.toString());
        }
    }

}
