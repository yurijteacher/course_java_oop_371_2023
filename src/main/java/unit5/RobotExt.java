package unit5;

public class RobotExt extends Robot {

    private double totalDistance = 0;

    @Override
    public void forward(double distance) {
        setDistance(distance);
        super.forward(distance);

        totalDistance += getDistance();
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public RobotExt() {
    }

    public RobotExt(double x, double y, double course, double distance) {
        super(x, y, course, distance);
    }

    public static void main(String[] args) {

        RobotExt robotExt = new RobotExt(100,100,20,0);
        robotExt.forward(80);
        System.out.println(robotExt);

        robotExt.setCourse(10);
        robotExt.forward(100);

        System.out.println(robotExt);

        for (RobotLine el : robotExt.getRobotLines()) {
            System.out.println(el);
        }

    }

    @Override
    public String toString() {
        return "RobotExt{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", course=" + getCourse() +
                ", distance=" + getDistance() +
                ", totalDistance=" + totalDistance +
                '}';
    }
}
