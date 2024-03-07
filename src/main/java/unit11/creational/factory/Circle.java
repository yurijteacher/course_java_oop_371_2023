package unit11.creational.factory;

public class Circle implements Share{
    int r  = 10;
    @Override
    public void draw(int x, int y) {
        System.out.println("Circle" + ", x" + x + ", y=" + y + ", a=" + r);
    }
}
