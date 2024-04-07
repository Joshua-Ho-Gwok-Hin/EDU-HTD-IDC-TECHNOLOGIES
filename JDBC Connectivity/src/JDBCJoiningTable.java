import java.sql.*;
import java.sql.SQLException;

public class JDBCJoiningTable {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        Savepoint s1 = null;
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "admin", "password");
            connection.setAutoCommit(false);
            System.out.println("Connection established.");

            statement = connection.createStatement();
            statement.execute("INSERT INTO productdetails.employee (name, salary) VALUES ('Steven Strange',5000)");
            System.out.println("Steven added executed.");
            statement.execute("INSERT INTO productdetails.employee (name, salary) VALUES ('Steve Roger',5000)");
            System.out.println("Steve Roger executed.");
            s1 = connection.setSavepoint("s1");
            System.out.println("Savepoint created.");
            statement.execute("DELETE FRROM productdetails.employee WHERE id =102"); // SQLException here for rollback testing.
            System.out.println("Delete id=102 executed.");

            connection.commit();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM productdetails.employee");
            while (resultSet.next()) {
                StringBuffer sb = new StringBuffer();
                int numColumns = resultSet.getMetaData().getColumnCount();
                for (int i = 0; i < numColumns; i++) {
                    sb.append(resultSet.getString(i + 1) + ", ");
                }
                sb.setLength(sb.length() - 2);
                System.out.println(sb);
            }
        } catch (SQLException e) {
            System.out.println(e);
            try {
                System.out.println(s1);
                connection.rollback(s1);
                connection.commit();
                System.out.println("Rollback complete.");
            } catch (SQLException ex) {
                System.out.println("Rollback failed.");
                System.out.println(ex);
            }
        } finally {
            try {
                statement.close();
                System.out.println("Statement closed.");
            } catch (SQLException ignore) {
            }
            try {
                connection.close();
                System.out.println("Connection closed.");
            } catch (SQLException ignore) {
            }
        }

    }
}
