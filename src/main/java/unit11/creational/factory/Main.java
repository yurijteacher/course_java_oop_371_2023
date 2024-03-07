package unit11.creational.factory;

public class Main {

    public static void main(String[] args) {

        FactoryShare factory = new FactoryShare();


        Share share = factory.getShare("квадрат");
        share.draw(5,10);




    }

}
