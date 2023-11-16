package unit8.robot;

public class RobotT1000 extends Robot{
    @Override
    public void print() {
        System.out.println("T1000");
    }

    public RobotT1000() {
    }

    public RobotT1000(Body body, Head head, Hand hand, Leg leg) {
        super(body, head, hand, leg);
    }
}
