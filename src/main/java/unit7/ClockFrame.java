package unit7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class ClockFrame {

    JFrame frame;
    JPanel panel;
    JLabel label;

    public ClockFrame() {

        frame = new JFrame("Clock");
        panel = new JPanel();
        label = new JLabel();


        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);

        frame.setSize(350, 60);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        ClockExt clockExt = new ClockExt(17, 40, 35);

//        Timer timer = new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                clockExt.nextSecond();
//                label.setText(clockExt.toString());
//            }
//        });

        ClockExt2 clockExt = new ClockExt2(17,50, 50, 0);

        Timer timer = new Timer(100, e -> {
//            clockExt.nextSecond();
            clockExt.nextMs();
            label.setText(clockExt.toString());
        });

        timer.start();

        frame.setVisible(true);





    }
}
