import java.sql.*;
import java.util.Locale;
import java.util.Scanner;

public class StoredProcedureProgram {

    public static Connection connection= null;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StoredProcedureProgram sPP = new StoredProcedureProgram();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase", "admin", "password");
            System.out.println("""
                    Enter Choice:
                    1. Insert record
                    2. Select record
                    3. Show all records
                    4. Callable statement: select record based on rollnumber""");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    sPP.insertRecord();
                    break;
                case 2:
                    sPP.selectRecord();
                    break;
                case 3:
                    sPP.selectAllRecords();
                    break;
                case 4:
                    sPP.selectRecordsByRollno();
                    break;
                default:
                    break;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void insertRecord() throws SQLException {
        String sql = "insert into student(name,percentage,address) values(?,?,?)";
        PreparedStatement prepStm  = connection.prepareStatement(sql);
        System.out.println("Enter name of student");
        prepStm.setString(1, scanner.nextLine());
        System.out.println("Entrr percentage of student");
        prepStm.setDouble(2, Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter address");
        prepStm.setString(3,scanner.nextLine());
        int rows = prepStm.executeUpdate();
        if (0 < rows) {
            System.out.println("Record insert successfully");
        }
    }

    private void selectRecord() throws SQLException {
        int num = scanner.nextInt();
        scanner.nextLine();
        String sql = "select * from studentdatabase.student where rollnumber=" + num;
        Statement stm = connection.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next()) {
            int rollNumber = rs.getInt("rollnumber");
            String studentName = rs.getString("name");
            double studentPercentage = rs.getDouble("percentage");
            String studentAddress = rs.getString("address");
            System.out.println("Rollnumber " + rollNumber);
            System.out.println("Student name " + studentName);
            System.out.println("Student Percentage " + studentPercentage);
            System.out.println("Student Address " + studentAddress);

        } else {

            System.out.println("no record found...");
        }

    }

    public void selectAllRecords() throws SQLException {
        CallableStatement callableStatement = connection.prepareCall("{call get_all()}");
        ResultSet rs = callableStatement.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt("rollnumber")+ " "+ rs.getString("name"));
        }
    }

    public void selectRecordsByRollno() throws SQLException {
        System.out.println("Enter the roll number to fetch detail");
        int roll = Integer.parseInt(scanner.nextLine());
        CallableStatement callableStatement = connection.prepareCall("{call GET_RECORD(?)}");
        callableStatement.setInt(1, roll);
        ResultSet rs = callableStatement.executeQuery();


        while (rs.next()) {
            System.out.println(rs.getInt("rollnumber"));
//                    + " " +
//                    rs.getString("name"+ " " +
//                            rs.getString("percentage" + " " +
//                                    rs.getString("address")))
//                    );
        }

    }


}
