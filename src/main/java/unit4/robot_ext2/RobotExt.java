package unit4.robot_ext2;

public class RobotExt extends Robot{

    protected double totalValue = 0;

    public static void main(String[] args) {

        RobotExt robotExt = new RobotExt();
        // robotExt.x = 0;
        robotExt.y = 10;
        robotExt.distance = 100;

        robotExt.print();


    }

    @Override
    public void print(){
        super.print();
        System.out.println(super.y + ", total: " + totalValue);

    }

}
