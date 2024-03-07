package unit11.structural.flyweight;

public class OracleJdbc implements JDBC {
    @Override
    public Object getConnection(String login, String password, String url) {
        return "connection by Oracle";
    }

    @Override
    public void execute(String sql) {
        System.out.println("sql by Oracle");
    }

    @Override
    public void executeUpdate(String sql) {
        System.out.println("update by Oracle");
    }
}
