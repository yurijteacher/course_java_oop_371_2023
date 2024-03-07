package unit11.structural.composite;

public class Main {

    public static void main(String[] args) {

        RobotT1000 t1000 = new RobotT1000();
        RobotT2000 t2000 = new RobotT2000();

        RobotComposite composite1 = new RobotComposite();
        composite1.addComposite(t1000);
        composite1.addComposite(t2000);

        RobotT3000 t3000 = new RobotT3000();
        RobotComposite composite2 = new RobotComposite();
        composite2.addComposite(composite1);

        composite2.addComposite(t3000);

        composite2.action();



    }

}
