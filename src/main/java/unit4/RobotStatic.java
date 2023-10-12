package unit4;

public class RobotStatic {
    static double x = 5;
    final static double y = 10;

    public static void print(){
        System.out.println(x + "," + y);
    }

    public static double add(double x1, double x2){
        return x1 + x2;
    }


    public static void main(String[] args) {
        System.out.println(x + "," + y);

        print();

        System.out.println(add(5,10));

        // y=15;

    }

}
