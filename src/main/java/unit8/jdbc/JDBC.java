package unit8.jdbc;

public interface JDBC {
    Object getConnection(String url, String username, String password);
    void statement(String sql);
}
