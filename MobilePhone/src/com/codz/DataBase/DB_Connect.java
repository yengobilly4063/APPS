package com.codz.DataBase;

import java.sql.*;

public class DB_Connect {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";



    public static Connection getConnection(){
        Connection con = null;

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

    public static void createMobilePhoneContactDatabase(){
        Connection con = getConnection();
        final String DB_NAME = "MobilePhone";
        final String TB_NAME = "Contacts";
        final String DB_CREATE_ST = "CREATE DATABASE IF NOT EXISTS " + DB_NAME;
        final String TB_CREATE_ST = "CREATE TABLE IF NOT EXISTS " + TB_NAME + "(ct_id int not null AUTO_INCREMENT PRIMARY KEY, name VARCHAR(250), number VARCHAR(12))";

        Statement stmt = null;
        try{
            System.out.println("creating database...");
            stmt = con.createStatement();

            stmt.execute(DB_CREATE_ST);
            stmt.execute("USE MobilePhone");
            stmt.execute(DB_CREATE_ST);

            System.out.println("Database created");
            //Print outs
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Statement resolved to null");
        }
    }


}
