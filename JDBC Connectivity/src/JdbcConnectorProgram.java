import java.sql.*;

public class JdbcConnectorProgram {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306",
                    "admin", "password");
            System.out.println("Connection established");
            Statement st = connection.createStatement();

            ResultSet resultSet = st.executeQuery("select * from productdetails.employee");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));

            }
//            System.out.println("Statement created");

//            String sql = "delete from productdetails.employee where id=102";

//            st.execute(sql);

//            System.out.println("table created");
//            st.close();
//            connection.close();

        } catch (SQLException e) {
            System.out.println("Cannot no no no");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
