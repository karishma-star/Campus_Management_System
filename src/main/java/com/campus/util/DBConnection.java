package com.campus.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public  class DBConnection{
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/campus_db";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        System.out.println("Database connection established successfully");
        return conn;
    }

}
