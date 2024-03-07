package unit11.structural.bridge.maker;

public class BMW implements Maker{
    @Override
    public void setMaker() {
        System.out.println("This is a BMW car!!!");
    }
}
