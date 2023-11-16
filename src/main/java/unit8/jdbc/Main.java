package unit8.jdbc;

public class Main {

    public static void main(String[] args) {
        MySqlJdbc mySqlJdbc = new MySqlJdbc();

        System.out.println(mySqlJdbc.getConnection("jdbc:mysql://localhost:3306/test1", "root", "root"));

        OracleJdbc oracleJdbc = new OracleJdbc();
        System.out.println(oracleJdbc.getConnection("jdbc:mysql://localhost:5432/test1", "root1", "root1234"));

    }
}
