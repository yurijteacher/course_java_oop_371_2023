package unit11.structural.flyweight;

public interface JDBC {

    Object getConnection(String login, String password, String url);
    void execute(String sql);
    void executeUpdate(String sql);


}
