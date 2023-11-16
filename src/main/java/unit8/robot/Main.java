package unit8.robot;

public class Main {

    public static void main(String[] args) {

        AppleBody appleBody = new AppleBody();
        AppleHead appleHead = new AppleHead();
        SonyHand sonyHand = new SonyHand();
        SamsungLeg samsungLeg = new SamsungLeg();

        Robot robot = new RobotT1000(appleBody, appleHead, sonyHand, samsungLeg);

        System.out.println(robot);

        SonyLeg sonyLeg = new SonyLeg();


        Robot robot2 = new RobotT1000(appleBody, appleHead, sonyHand, sonyLeg);

        System.out.println(robot2);


        System.out.println(robot.hashCode());
        System.out.println(robot2.hashCode());


    }

}
