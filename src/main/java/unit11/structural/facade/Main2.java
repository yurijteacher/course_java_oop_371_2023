package unit11.structural.facade;

public class Main2 {
    public static void main(String[] args) {

        Hello hello = new Hello();
        World world = new World();

        hello.printHello();
        world.printWorld();
        System.out.println("!!!");


    }
}
