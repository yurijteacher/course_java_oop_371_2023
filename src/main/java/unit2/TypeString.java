package unit2;

import static java.lang.Math.PI;

public class TypeString {

    public static void main(String[] args) {

        /*
        byte
        short
        int
        long
        float
        double
        char
        boolean
          */

        int a = 5;
        a = 3;

        String text = "ab";
        System.out.println(text.hashCode());

        text = text + "123";
        System.out.println(text.hashCode());

        String text1 = "ab123";

        System.out.println(text1.hashCode());

        System.out.println(text==text1);   // false ==

        System.out.println(text.equals(text1));

        String text3 = new String("ab123");

        System.out.println(text3.equals(text1));

        if(text3.hashCode()==text1.hashCode()){
            System.out.println("true");
        }

        System.out.println(text.equals(text3));

        char[] arr = text3.toCharArray();

        for (char el : arr) {
            System.out.println(el);
        }

        String text4 =new String(arr,1,4);

        System.out.println(text4);

        String text5 = "\t \n I study Java with my teacher!!! \n \r";

        System.out.println(text5.trim());

        System.out.println(text5.toUpperCase().trim());
        System.out.println(text5.toLowerCase().trim());

        text5 = text5.trim();
        System.out.println(text5);

        boolean logic = text5.startsWith("I study");
        System.out.println(logic);

        boolean logic1 = text5.endsWith("I study");
        System.out.println(logic1);

        System.out.println(text5.replace('a', '_'));
        System.out.println(text5.replace("st","__"));

        String text6 = "I,study.Java with_my teacher!!!";

        String[] array1 = text6.split(" |\\.|\\,|_");

        for (String elem :
             array1) {
            System.out.println(elem);
        }

        StringBuilder sb = new StringBuilder("asd");
        System.out.println(sb.hashCode());
        sb.append("123");

        System.out.println(sb + ":" + sb.hashCode());

        StringBuffer sb1 = new StringBuffer("dsa");
        sb1.append("123");
        System.out.println(sb1);
    }

}
