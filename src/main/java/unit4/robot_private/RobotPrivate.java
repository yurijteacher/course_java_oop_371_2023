package unit4.robot_private;

import unit4.robot_public.RobotPublic;

public class RobotPrivate {

    private double x = 0;
    private double y = 0;
    private double distance = 100;
    private double course = 90;
    private double total = 0;
    public RobotPrivate() {}
    public void print(){
        System.out.println("x:" + x +", y" + y + ", dist:" + distance + ", course:" + course+", total:" + total);
    }

    private void addTotalDistance(){
        total=total+distance;
    }

    public static void main(String[] args) {

        RobotPrivate robot = new RobotPrivate();

        robot.x = 100;
        robot.y = 100;
        robot.distance = 100;
        robot.course = 180;

        robot.addTotalDistance();

        robot.print();

    }

}
