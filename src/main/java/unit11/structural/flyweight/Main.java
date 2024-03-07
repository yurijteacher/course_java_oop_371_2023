package unit11.structural.flyweight;

public class Main {

    public static void main(String[] args) {

        FlyWeightJdbc factory = new FlyWeightJdbc();

        JDBC mysql = factory.getDriver("mysql");
        JDBC mysql2 = factory.getDriver("mysql");

        System.out.println(mysql.hashCode());
        System.out.println(mysql2.hashCode());



        // mysql.getConnection("1", "1", "jdbc:mysql://localhost:3306/test");





    }
}
