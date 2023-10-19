package unit5;

import javax.swing.*;

public class Main2 {


    public static void main(String[] args) {

        final int count = 12;
        int size = 150;

        Robot robot = new Robot(380, 320);

        for (int i = 0; i < 120; i++) {
            robot.forward(size);
            robot.setCourse(robot.getCourse()+360/count);
            robot.forward(size);
        }


        RobotJFrame frame = new RobotJFrame(robot);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }
}
