package unit11.creational.factory.db;

public class MySQLJdbc implements JDBC{
    @Override
    public Object getConnection(String login, String password, String url) {

        System.out.println("connection");
        return "connection";
    }

    @Override
    public void execute(String sql) {
        System.out.println("sql");
    }

    @Override
    public void executeUpdate(String sql) {
        System.out.println("update");
    }
}
