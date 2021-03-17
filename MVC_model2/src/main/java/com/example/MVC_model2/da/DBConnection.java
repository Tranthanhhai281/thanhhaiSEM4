package com.example.MVC_model2.da;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection == null) {
            //1. Loading driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2. connect
            connection = DriverManager.getConnection("jdbc:mysql://localhost:81/ecommerceDB", "root", "");

        }
        return connection;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        if (getConnection() != null) {
            System.out.println("okie");
        }
    }
}
