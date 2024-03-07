package unit11.creational.factory;

public class Square implements Share{

    int a  = 5;
    @Override
    public void draw(int x, int y) {
        System.out.println("Square" + ", x" + x + ", y=" + y + ", a=" + a);
    }
}
