package unit10.shop.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDB {

    Connection connection = null;

    public Connection getConnection(String url, String username, String password){


        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("connection to db");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }


}
