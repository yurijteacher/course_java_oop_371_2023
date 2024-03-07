package unit11.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class RobotComposite implements Robot{

    List<Robot> composite = new ArrayList<>();

    public void addComposite(Robot robot){
        composite.add(robot);
    }

    public void deleteComposite(Robot robot){
        composite.remove(robot);
    }

    @Override
    public void action() {
        for (Robot r : composite){
            System.out.println(r);
        }
    }
}
