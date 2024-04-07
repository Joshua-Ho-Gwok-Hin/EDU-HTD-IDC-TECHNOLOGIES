import java.sql.*;
import java.sql.SQLException;

public class JdbcTry {

    static String tableName = "productdetails.employee";

    public static void main(String[] args) throws SQLException, ClassNotFoundException, SQLException {


            Class.forName("com.mysql.cj.jdbc.Driver"); //
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "admin", "password");
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from " + tableName);

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name"));
            }

            statement.close();
            con.close();



    }
}
