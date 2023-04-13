/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginRegister;

import CW2Group4.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saitama
 */
public class VerifyProvidedPassword {
    
    private static String securePassword;
    private static String salt;
    public static boolean VerifyProvidedPassword(String email, String providedPassword) {
    
        Connection con = DB.getConnected(); 
        
        try {
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM User WHERE userEmail = '" + email + "'";
            
            ResultSet rs = stmt.executeQuery(sql);
           
            while(rs.next()){
                // Encrypted and Base64 encoded password read from database
                securePassword = rs.getString(2);
                salt = rs.getString(4);
            }
            
            
            
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(VerifyProvidedPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        
        
        boolean passwordMatch = PasswordUtils.verifyUserPassword(providedPassword, securePassword, salt);
        
        if(passwordMatch) 
        {
            System.out.println("Provided user password is correct.");
        } else {
            System.out.println("Provided password is incorrect");
        }
        
        return passwordMatch;
    }
}

