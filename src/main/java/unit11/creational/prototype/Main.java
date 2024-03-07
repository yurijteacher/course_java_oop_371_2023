package unit11.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Robot robot1 = new Robot();
        robot1.setName("robot 1");
        robot1.setModel("T1000");
        robot1.setPower(2500);

        System.out.println(robot1.hashCode());

        Robot robot2 = robot1.clone("root"+1, "T2000", 3000);

        System.out.println(robot2.hashCode());


        List<Robot> robotList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            robotList.add(robot1.clone("robot"+i, "T"+i, (i+1)*2));
        }

        for (Robot r: robotList){
            System.out.println(r);
        }

    }

}
