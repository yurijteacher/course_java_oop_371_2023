package unit11.creational.factory.db;

public class Main {

    public static void main(String[] args) {

        FactoryJdbc factory = new FactoryJdbc();

        JDBC mysql = factory.getDriver("mysql");
        mysql.getConnection("1", "1", "jdbc:mysql://localhost:3306/test");





    }
}
