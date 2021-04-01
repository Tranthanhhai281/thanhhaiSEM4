package com.example.demo.Model;

import java.sql.*;

public class LoginDA {
    private String username, password;

    public LoginDA() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private static final String tblName = "user";
    private static Connection conn = null;
    private static Statement stat = null;
    private static PreparedStatement pstm = null;

    public static void createConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:81/accounts", "root", "");

    }

    public static boolean checkLoginStatement(String user, String pass) throws SQLException {
        String dbQuery = "SELECT username FROM user WHERE usernames='" + user + "' AND password='" + pass + "' ";
        stat = conn.createStatement();
        ResultSet resultSet = stat.executeQuery(dbQuery);
        while (resultSet.next()) {
            System.out.println("Username is: " + resultSet.getString("username"));
            return true;
        }
        return false;
    }
}
