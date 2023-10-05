package unit3;

import java.util.Stack;

public class MyLifo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        int a = stack.peek();

        System.out.println(a + ":" + stack);

        int b = stack.pop();

        System.out.println(b + ":" + stack);

        int b1 = stack.pop();

        System.out.println(b1 + ":" + stack);

        int b2 = stack.pop();

        System.out.println(b2 + ":" + stack);

        stack.push(4);

        System.out.println(stack);




    }

}
