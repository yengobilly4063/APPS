package com.codz.DataBase;

import java.sql.*;

public class DB_Connect {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/?";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";



    public static Connection getConnection(){
        Connection con = null;
        Statement stmt = null;

        try{
            System.out.println("Registering drivers...");
            Class.forName(DB_DRIVER);
            System.out.println("Drivers registered :)");
            try{
                System.out.println("Establishing connection...");
                con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                System.out.println("Connection established...");
                return con;
            }catch (SQLException se){
                se.printStackTrace();
                System.out.println("Connection not established...");
            }
        }catch(Exception re){
            System.out.println("Database drivers not found");
        }
        return null;
    }
}
