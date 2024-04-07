package data_access_object;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {

    Connection connection = null;
    PreparedStatement pstm = null;
    ResultSet resultSet = null;

    public StudentDao() {
    }

    private Connection getConnection() throws SQLException {

        Connection connection1;
        connection1 = ConnectionFactory.getConnection();
        return connection1;
    }

    public void add(Student student) {
        try {

            String queryString = "insert into student(rollno, name, course, address) values(?,?,?,?)";
            connection = getConnection();
            pstm = connection.prepareStatement(queryString);
            pstm.setInt(1,student.getRollNo());
            pstm.setString(2, student.getName());
            pstm.setString(3, student.getCourse());
            pstm.setString(4,student.getAddress());
            pstm.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if ((pstm != null)) {
                    pstm.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void update(Student student) {

        try {

            String queryString = "update student set name=?, course=?, address=? where rollNo=?";
            connection = getConnection();
            pstm = connection.prepareStatement(queryString);
            pstm.setString(1, student.getName());
            pstm.setString(2, student.getCourse());
            pstm.setString(3,student.getAddress());
            pstm.setInt(4,student.getRollNo());
            pstm.executeUpdate();
            System.out.println("Table updated successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if ((pstm != null)) {
                    pstm.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void delete(int rollno) {
        try {
            String queryString = "delete from student where rollno=?";
            connection = getConnection();
            pstm = connection.prepareStatement(queryString);
            pstm.setInt(1, rollno);
            pstm.executeUpdate();
            System.out.println("Student deleted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if ((pstm != null)) {
                    pstm.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void findAll() {
        try {
            String queryString = "select * from student";
            connection=getConnection();
            pstm = connection.prepareStatement(queryString);
            resultSet= pstm.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("rollno")+ " " +
                        resultSet.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if ((pstm != null)) {
                    pstm.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}



