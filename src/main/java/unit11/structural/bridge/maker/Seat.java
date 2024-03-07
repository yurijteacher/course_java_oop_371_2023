package unit11.structural.bridge.maker;

public class Seat implements Maker{
    @Override
    public void setMaker() {
        System.out.println("This is a car from Seat!!!");
    }
}
