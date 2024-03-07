package unit11.creational.abstract_factory;

public abstract class Robot {

    private Leg leg;
    private Head head;
    private Hand hand;

    public Robot(Leg leg, Head head, Hand hand) {
        this.leg = leg;
        this.head = head;
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "leg=" + leg +
                ", head=" + head +
                ", hand=" + hand +
                '}';
    }
}
