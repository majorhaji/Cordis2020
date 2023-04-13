/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginRegister;

import CW2Group4.DB;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author Saitama
 */
public class ProtectUserPassword {
    public static ArrayList<String> list = new ArrayList<>();
    public static ArrayList<String> ProtectUserPassword(String myPassword){
        
        // Generate Salt. The generated value can be stored in DB. 
        String salt = PasswordUtils.getSalt(30);
        
        
        
        // Protect user's password. The generated value can be stored in DB.
        String mySecurePassword = PasswordUtils.generateSecurePassword(myPassword, salt);
        
        list.add(salt);
        list.add(mySecurePassword);
        
        
      return list;
         
    }
        
}
