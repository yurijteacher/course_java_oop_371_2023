package unit5;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class Robot {
    private double x = 0;
    private double y = 0;
    private double course = 0;
    private double distance = 0;

    private List<RobotLine> robotLines = new ArrayList<>();

    public List<RobotLine> getRobotLines() {
        return robotLines;
    }

    public void setRobotLines(List<RobotLine> robotLines) {
        this.robotLines = robotLines;
    }

    public void forward(double distance){
//        x = x + distance*Math.cos(course/180*Math.PI);
//        y = y + distance*Math.sin(course/180*Math.PI);

        double xOld = x;
        double yOld = y;

        x += distance*cos(course/180*PI);
        y += distance*sin(course/180*PI);

//        x += distance*cos(course*180/PI);
//        y += distance*sin(course*180/PI);

        // RobotLine robotLine = new RobotLine(xOld, yOld, x,y);
        // robotLines.add(robotLine);

        robotLines.add(new RobotLine(xOld, yOld, x,y));
    }

    // set/get
    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }


    public void setCourse(double course) {
        this.course = course;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getCourse() {
        return course;
    }

    public double getDistance() {
        return distance;
    }

    public Robot() {}

    public Robot(double x) {
        this.x = x;
    }

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Robot(double x, double y, double course) {
        this.x = x;
        this.y = y;
        this.course = course;
    }

    public Robot(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    public static void main(String[] args) {

        Robot robot = new Robot();
        System.out.println(robot.toString());

        Robot robot1 = new Robot(1);

        System.out.println(robot1);

        Robot robot2 = new Robot(1,2);
        System.out.println(robot2);

        Robot robot3 = new Robot(10,10, 20);
        System.out.println(robot3);

        Robot robot4 = new Robot(10,10,10,20);
        System.out.println(robot4);


        robot4.x = 20;

        System.out.println(robot4);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }
}
