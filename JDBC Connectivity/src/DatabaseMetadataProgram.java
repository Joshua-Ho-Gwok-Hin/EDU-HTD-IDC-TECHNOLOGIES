import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseMetadataProgram {

    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306");
    }
}
