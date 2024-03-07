package unit11.creational.factory;

public class Point implements Share{
    @Override
    public void draw(int x, int y) {
        System.out.println("Point " + ", x=" + x +", y="+ y);
    }
}
