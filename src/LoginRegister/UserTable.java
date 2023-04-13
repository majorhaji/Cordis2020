/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginRegister;

import CW2Group4.DB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Saitama
 */
public class UserTable {
    public static void insert(String username, String password, String email, String salt){
        
        Connection connection = DB.getConnected();
        
        String sql = "INSERT INTO User (userName, userPassword, userEmail, Salt) VALUES"
                + "("
                    + "'" + username + "',"
                    + "'" + password + "',"
                    + "'" + email + "',"
                    + "'" + salt + "'"
                + ")";
        
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("User " + username + " inserted");
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error while inserting into User table: " + ex.getMessage());
        }
        
        
    
}
    
    public static ResultSet get(String userEmail){
        
        Connection connection = DB.getConnected();
        String sql = "SELECT * FROM User WHERE userEmail = '" + userEmail + "'";
        
        ResultSet result = null;
        
        try{
            Statement statement = connection.createStatement();
            result = statement.executeQuery(sql);
            
            if(result.next()){
                System.out.println("User " + result.getString("userEmail")+" retrieved");
            }
        } catch(SQLException ex){
            System.out.println("Error retrieving user " + ex.getMessage());
        } finally {
            return result;
        }
    } 

}