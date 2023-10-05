package com.example.Actividad2.Actividad2.infrastructure.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconecction {
    private static Connection connection;

    private DBconecction(){}

    public static Connection getInstance(){
        if (connection == null){
            try {
                connection = DriverManager.getConnection("jdbc:mysql://database-1.cabn5upwsapr.us-east-1.rds.amazonaws.com","admin","admin1234");
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
        return connection;
    }
}
