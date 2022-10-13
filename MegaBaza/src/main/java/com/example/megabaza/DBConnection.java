package com.example.megabaza;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
    public void DBConnection(String username,String password,String jdbcURL)
    {
        try {
            java.sql.Connection connection = DriverManager.getConnection(username, password, jdbcURL);
        } catch (SQLException e)
        {
            System.out.println("Connection error");
            e.printStackTrace();
        }
    }
}
