package unit5;

import javax.swing.*;
import java.awt.*;

public class RobotJFrame extends JFrame {

    public RobotJFrame(Robot robot) {
        setTitle("RobotLine");
        add(new RobotComponent(robot));
        setBounds(0,0,800,800);
    }
}
