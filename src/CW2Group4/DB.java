/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CW2Group4;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Saitama
 */
public class DB {
    
    public static Connection getConnection(){
        String urlSQLite = "jdbc:sqlite:group4.db";
        
        
        try {
            Driver driverSQLite = new org.sqlite.JDBC();
            DriverManager.registerDriver(driverSQLite);
            System.out.println("SQLite Driver loaded.");
        } catch (SQLException ex) {
            System.out.println("Problem with the SQLite driver: " + ex.getMessage());
        }
        
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection(urlSQLite);
            System.out.println("Connected to the database.");
        } catch (SQLException ex) {
            System.out.println("Error connecting to the database: " + ex.getMessage());
        }
        
        return connection;
    }
    
    public static Connection getConnected(){
         String urlSQLite = "jdbc:sqlite:users.db";
        
        
        try {
            Driver driverSQLite = new org.sqlite.JDBC();
            DriverManager.registerDriver(driverSQLite);
            System.out.println("SQLite Driver loaded.");
        } catch (SQLException ex) {
            System.out.println("Problem with the SQLite driver: " + ex.getMessage());
        }
        
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection(urlSQLite);
            System.out.println("Connected to the database.");
        } catch (SQLException ex) {
            System.out.println("Error connecting to the database: " + ex.getMessage());
        }
        
        return connection;
    }
    }
    

