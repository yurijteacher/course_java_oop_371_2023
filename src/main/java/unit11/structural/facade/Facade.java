package unit11.structural.facade;

public class Facade {

    public void  print(){

        Hello hello = new Hello();
        World world = new World();

        hello.printHello();
        world.printWorld();


        System.out.println("!!!");

    }


}
