package unit4.robot_default;

public class Robot {
    double x = 0;
    double y = 0;
    double distance = 100;
    double course = 90;
    double total = 0;
    public Robot() {}
    public void print(){
        System.out.println("x:" + x +", y" + y + ", dist:" + distance + ", course:" + course+", total:" + total);
    }

    private void addTotalDistance(){
        total=total+distance;
    }

    public static void main(String[] args) {

        Robot robot = new Robot();

        robot.x = 10;
        robot.y = 10;
        robot.distance = 100;
        robot.course = 180;

        robot.addTotalDistance();

        robot.print();

    }


}
