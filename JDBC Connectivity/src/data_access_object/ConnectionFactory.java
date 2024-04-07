package data_access_object;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    String driverClassName = "com.mysql.cj.jdbc.Driver";
    static String connectionUrl = "jdbc:mysql://localhost:3306/dao_demo";
    static String dbUser = "admin";
    static String dbPassword = "password";

    private static ConnectionFactory connectionFactory = null;

    private ConnectionFactory() {
        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        connection = DriverManager.getConnection(connectionUrl, dbUser, dbPassword);
        return connection;
    }

//    public static ConnectionFactory getInstance() {
//        if (connectionFactory == null) {
//            connectionFactory = new ConnectionFactory();
//        }
//        return connectionFactory;
//    }



}
