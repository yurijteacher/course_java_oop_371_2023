package unit11.creational.abstract_factory.hand;

import unit11.creational.abstract_factory.Hand;

public class SonyHand implements Hand {
    @Override
    public void takeSomething() {
        System.out.println("take");
    }
}
