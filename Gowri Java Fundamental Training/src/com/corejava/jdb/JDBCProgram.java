package com.corejava.jdb;

import java.sql.*;

public class JDBCProgram {

    public void connectToAndQueryDatabase(String username, String password) throws SQLException {

        Connection con = DriverManager.getConnection(
                "jdbc:myDriver:myDatabase",
                username,
                password);

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT a, b, c From Table1");

        while (rs.next()) {
            int x = rs.getInt("a");
            String s = rs.getString("a");
            float f = rs.getFloat("c");
        }

    }
}
