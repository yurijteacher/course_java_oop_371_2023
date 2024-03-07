package unit11.creational.singleton;

public class Test {

    public static void main(String[] args) {

        Singleton test1 = Singleton.getInstance();
        test1.print();

        Singleton test2 = Singleton.getInstance();
        test2.print();


    }

}
