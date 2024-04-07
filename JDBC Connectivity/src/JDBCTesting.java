import java.sql.*;

public class JDBCTesting {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "admin", "password");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from batch.customer_details");

        while (resultSet.next()) {
            System.out.println(resultSet.getString("full_name"));

        }
        connection.setAutoCommit(false);
        statement.close();
        connection.close();
    }
}
