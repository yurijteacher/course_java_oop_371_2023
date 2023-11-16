package unit8.robot;

public abstract class Robot {

    public abstract void print();

    private Body body;
    private Head head;
    private Hand hand;
    private Leg leg;

    public Robot() {
    }

    public Robot(Body body, Head head, Hand hand, Leg leg) {
        this.body = body;
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "body=" + body +
                ", head=" + head +
                ", hand=" + hand +
                ", leg=" + leg +
                '}';
    }
}
