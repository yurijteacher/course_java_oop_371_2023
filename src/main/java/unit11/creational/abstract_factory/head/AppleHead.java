package unit11.creational.abstract_factory.head;

import unit11.creational.abstract_factory.Hand;
import unit11.creational.abstract_factory.Head;

public class AppleHead implements Head {
    @Override
    public void calculation() {
        System.out.println("calc from Apple");
    }
}
