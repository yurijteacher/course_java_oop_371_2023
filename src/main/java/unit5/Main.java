package unit5;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot(1,2,3,4);
        System.out.println(robot);

        // robot.x = 10;

        robot.setX(10);
        robot.setY(20);
        robot.setCourse(45);
        robot.setDistance(100);

        System.out.println(robot);

        System.out.println(robot.getX()+":"+ robot.getY()+":"+ robot.getCourse()+":"+robot.getDistance());

        robot.setX(0);
        robot.setY(0);
        robot.setCourse(45);
//        robot.setDistance(10);

        robot.forward(10);

        System.out.println(robot);

        robot.setCourse(90);
        robot.forward(20);

        System.out.println(robot);

        RobotJFrame frame = new RobotJFrame(robot);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

}
