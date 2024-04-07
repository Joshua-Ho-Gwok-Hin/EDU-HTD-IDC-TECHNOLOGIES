import java.sql.*;

public class SQLExceptionProgram {

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "admin", "password");
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from productdetails.employee");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("nadme"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
