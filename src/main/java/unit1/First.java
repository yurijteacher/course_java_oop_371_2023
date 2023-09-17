package unit1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class First {

//    public static void main(String[] asd){
//
//    }

    static int a = 5;
    static int b = 10;


    public static void add(int x, int y){
        System.out.println(x+y);
    }

    public static int sub(int x, int y){
        return x-y;
    }


    // psvm
    public static void main(String[] args) {
        // sout
        System.out.println("Hello students!!!");

        String text = "Hello!!!";

        byte b = 5;
        short sh = 1;
        int i  = 5;
        long l = 5L;
        float f = 5f;
        double d = 6;
        char ch = 'a';
        boolean logic = true;

        char[] text1 = text.toCharArray();

        for (int j = 0; j < text1.length; j++) {
            System.out.println(text1[j]);
        }

        int[] array = new int[4];
        array[0]= 1;
        array[1]= 2;
        array[2]= 3;
        array[3]= 4;

        int[] array1  = {1,2,3,5,};

        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + ", ");
        }
        System.out.println("\n");

        int j = 0;
        for (; j < array1.length; j++) {
            System.out.print(array1[j] + ": ");
        }

        j = 0;
        for (; j < array1.length; ) {
            System.out.print(array1[j] + ": ");
            j++;
        }

        j = 0;
        while (j < array1.length){

        }

        j = 0;
        do {
            System.out.println(array1[j] + ";");
            j++;
        } while (j < array1.length);

        List<Integer> list = List.of(1,2,3,4);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        for (Integer el : list1) {
            System.out.println(el);
        }

        Arrays.toString(array1);

        list.stream().forEach(el->{
            System.out.println(el);
        });



        add(a,b);

        System.out.println(sub(10,5));
    }




}
