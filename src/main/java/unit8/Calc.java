package unit8;

public class Calc implements Calculation, Information {
    @Override
    public double add(double a, double b) {
        return 0;
    }

    @Override
    public double sub(double a, double b) {
        return 0;
    }


    public static void main(String[] args) {

        Calc calculation = new Calc();
        System.out.println(calculation.div(5, 1));
        System.out.println(calculation.add(5, 4));
        System.out.println(calculation.sub(10, 4));
        System.out.println(Calculation.mul(5, 5));

//        Calculation.n = 10;

        System.out.println(Calculation.n);

    }

    @Override
    public void info() {
        System.out.println("My calculation");
    }
}
