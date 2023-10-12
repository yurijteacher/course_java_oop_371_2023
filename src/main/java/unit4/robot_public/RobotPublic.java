package unit4.robot_public;

public class RobotPublic {

    public double x = 0;
    public double y = 0;
    public double distance = 100;
    public double course = 90;
    public double total = 0;
    public RobotPublic() {}
    public void print(){
        System.out.println("x:" + x +", y" + y + ", dist:" + distance + ", course:" + course+", total:" + total);
    }

    private void addTotalDistance(){
        total=total+distance;
    }

    public static void main(String[] args) {

        RobotPublic robot = new RobotPublic();

        robot.x = 10;
        robot.y = 10;
        robot.distance = 100;
        robot.course = 180;

        robot.addTotalDistance();

        robot.print();

    }

}
