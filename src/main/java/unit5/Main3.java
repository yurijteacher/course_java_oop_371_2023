package unit5;

import javax.swing.*;

public class Main3 {

    public static void main(String[] args) {

        final int count = 12;
        int size = 50;

        Robot robot = new Robot(300, 150);

        for (int i = 0; i < size; i++) {
            robot.forward(size);
            robot.setCourse(robot.getCourse()+360/count);
            robot.forward(size);
        }


        RobotJFrame frame = new RobotJFrame(robot);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }

}
