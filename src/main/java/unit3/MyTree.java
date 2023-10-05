package unit3;

import java.util.Comparator;
import java.util.TreeSet;

public class MyTree {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.naturalOrder());
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(4);

        treeSet.add(1);

        System.out.println(treeSet);


        TreeSet<Integer> treeSet1 = new TreeSet<>(Comparator.reverseOrder());
        treeSet1.add(0);
        treeSet1.add(6);
        treeSet1.add(5);
        treeSet1.add(3);
        treeSet1.add(4);

        System.out.println(treeSet1);

        //
        TreeSet<Integer> treeSet2 = new TreeSet<>(treeSet);
        treeSet2.addAll(treeSet1);
        System.out.println(treeSet2);

        //
        TreeSet<Integer> treeSet3 = new TreeSet<>(treeSet);
        treeSet3.retainAll(treeSet1);
        System.out.println(treeSet3);

        TreeSet<Integer> treeSet4 = new TreeSet<>(treeSet);
        treeSet4.removeAll(treeSet1);
        System.out.println(treeSet4);


    }


}
