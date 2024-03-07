package unit11.creational.abstract_factory;

import unit11.creational.abstract_factory.hand.SonyHand;
import unit11.creational.abstract_factory.head.AppleHead;
import unit11.creational.abstract_factory.leg.SamsungLeg;

public class Main {

    public static void main(String[] args) {

        SonyHand sonyHand = new SonyHand();
        SamsungLeg samsungLeg = new SamsungLeg();
        AppleHead appleHead = new AppleHead();


        RobotT1000 t1000 = new RobotT1000(samsungLeg, appleHead, sonyHand);

        System.out.println(t1000);


    }

}
