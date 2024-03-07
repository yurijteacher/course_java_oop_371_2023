package unit11.creational.abstract_factory.leg;

import unit11.creational.abstract_factory.Leg;

public class SamsungLeg implements Leg {
    @Override
    public void go() {
        System.out.println("go from Samsung");
    }
}
