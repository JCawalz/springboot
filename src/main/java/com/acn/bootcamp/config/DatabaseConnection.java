package com.acn.bootcamp.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by jaqcawaling on 7/6/17.
 */

public class DatabaseConnection {

    Connection conn = null;
    public Connection getConnection() {

        try {
            if (conn == null) {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/citizen_records", "root", "");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Unable to connect. Please configure your database.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Unable to connect. Please configure your database.");
        }
        return conn;
    }


}
