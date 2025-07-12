package com.bank;

import java.sql.*;

public class DBUtil {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bankapp", "root", "Irshad.k02");
    }
}