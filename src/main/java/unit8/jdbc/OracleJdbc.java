package unit8.jdbc;

public class OracleJdbc implements JDBC{
    @Override
    public Object getConnection(String url, String username, String password) {
        return "get Connection to Oracle";
    }

    @Override
    public void statement(String sql) {
        System.out.println("sql to mysql db!!");
    }
}
