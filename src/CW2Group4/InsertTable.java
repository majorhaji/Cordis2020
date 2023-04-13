/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CW2Group4;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Saitama
 */
public class InsertTable {
    
    public static void insertFundingScheme(int id, String code, String title, String description, String language){
        
        Connection connection = DB.getConnection();
        
        String sql = "INSERT INTO fundingScheme (fsId, fsCode, fsTitle, fsDescription, fsLanguage) VALUES"
                + "("
                    + "'" + id + "',"
                    + "'" + code + "',"
                    + "'" + title + "',"
                    + "'" + description + "',"
                    + "'" + language + "'"
                + ")";
        
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Funding Scheme "+ code + " inserted");
        } catch (SQLException ex) {
            System.out.println("Error while inserting into Funding Scheme table: " + ex.getMessage());
        }
    }
    
    public static void insertFS(String code, String title, String language){
        
        Connection connection = DB.getConnection();
        
        String sql = "INSERT INTO fundingScheme (fsCode, fsTitle, fsLanguage) VALUES"
                + "("
                   
                    + "'" + code + "',"
                    + "'" + title + "',"
                   
                    + "'" + language + "'"
                + ")";
        
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Funding Scheme "+ code + " inserted");
        } catch (SQLException ex) {
            System.out.println("Error while inserting into Funding Scheme table: " + ex.getMessage());
        }
    }
    public static void insertProjects(int id, int rcn, String acrnm, String status, String program, String topics, String fProgram, String title, String sDate, String fDate, String Url, String objective, double totalCost, double ecMax, String call, String fsCode, String proCoordinator, String proCoCountry, String proParticipants, String proPaCountry, String proSubjects){
        
        
        Connection connection = DB.getConnection();
        
        
        String sql = "INSERT INTO projects (proId, proRcn, proAcronym,  proStatus, proPrgrm, proTopics, proFrmwkPrgrm, proTitle, proStartDate,  proEndDate, proUrl, proObjective,  proTotalCost, proEcMax,  proCall, fsCode, proCoordinator, proCoCountry,  proParticipants,   proParCountry,  proSubjects) VALUES"
                + "("
                    + "'" + id + "',"
                    + "'" + rcn + "',"
                    + "'" + acrnm + "',"
                    + "'" + status + "',"
                    + "'" + program + "',"
                    + "'" + topics + "',"
                    + "'" + fProgram + "',"
                    + "'" + title + "',"
                    + "'" + sDate + "',"
                    + "'" + fDate + "',"
                    + "'" + Url + "',"
                    + "'" + objective + "',"
                    + "'" + totalCost + "',"
                    + "'" + ecMax + "',"
                    + "'" + call + "',"
                    + "'" + fsCode + "',"
                    + "'" + proCoordinator + "',"
                    + "'" + proCoCountry + "',"
                    + "'" + proParticipants + "',"
                    + "'" + proPaCountry + "',"
                    + "'" + proSubjects + "'"
                  
                + ")";
        
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.executeUpdate();
            
            System.out.println("Project "+ title + " inserted");
        } catch (SQLException ex) {
            System.out.println("Error while inserting into Project table: " + ex.getMessage());
        }
    }
    
     public static void insertOrganisations(int proId, int rcn, String acrnm, String role, int orgId, String name, String sName, String actType, String endPart, double ecCont, String country, String street, String city, String postCode, String orgUrl, String vatNum, String contactForm){
        
        
        Connection connection = DB.getConnection();
        
        String sql = "INSERT INTO organisations (proId, proRcn, proAcronym,  orgRole, orgId, orgName, orgSname, orgActivityType, orgEndPart,  orgEcCont, orgCountry, orgStreet,  orgCity, orgPcode,  orgUrl, orgVat, orgContactForm) VALUES"
                + "("
                    + "'" + proId + "',"
                    + "'" + rcn + "',"
                    + "'" + acrnm + "',"
                    + "'" + role + "',"
                    + "'" + orgId + "',"
                    + "'" + name + "',"
                    + "'" + sName + "',"
                    + "'" + actType + "',"
                    + "'" + endPart + "',"
                    + "'" + ecCont + "',"
                    + "'" + country + "',"
                    + "'" + street + "',"
                    + "'" + city + "',"
                    + "'" + postCode + "',"
                    + "'" + orgUrl + "',"
                    + "'" + vatNum + "',"
                    + "'" + contactForm + "'"
                + ")";
        
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Organisation "+ name + " inserted");
        } catch (SQLException ex) {
            System.out.println("Error while inserting into Organisation table: " + ex.getMessage());
        }
    }
     
     public static void insertTopics(int rcn, String code, String title, String language){
        
        
        Connection connection = DB.getConnection();
        
        String sql = "INSERT INTO topics (topRcn, topCode, topTitle, topLanguage) VALUES"
                + "("
                    + "'" + rcn + "',"
                    + "'" + code + "',"
                    + "'" + title + "',"
                    + "'" + language + "'"
                + ")";
        
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Topic "+ code + " inserted");
        } catch (SQLException ex) {
            System.out.println("Error while inserting into Topics table: " + ex.getMessage());
        }
    }
     
     public static void insertDataset(int proId, int rcn, String acrnm, String role, int orgId, String name, String sName, String actType, String endPart, double ecCont, String country, String street, String city, String postCode, String orgUrl, String vatNum, String contactForm){
        
        
        Connection connection = DB.getConnection();
        
        String sql = "INSERT INTO dataset (proId, proRcn, proAcronym,  dataRole, dataId, orgName, orgSname, orgActivityType, orgEndPart,  orgEcCont, orgCountry, orgStreet,  orgCity, orgPcode,  orgUrl, orgVat, orgContactForm) VALUES"
                + "("
                    + "'" + proId + "',"
                    + "'" + rcn + "',"
                    + "'" + acrnm + "',"
                    + "'" + role + "',"
                    + "'" + orgId + "',"
                    + "'" + name + "',"
                    + "'" + sName + "',"
                    + "'" + actType + "',"
                    + "'" + endPart + "',"
                    + "'" + ecCont + "',"
                    + "'" + country + "',"
                    + "'" + street + "',"
                    + "'" + city + "',"
                    + "'" + postCode + "',"
                    + "'" + orgUrl + "',"
                    + "'" + vatNum + "',"
                    + "'" + contactForm + "'"
                + ")";
        
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Dataset "+ sName + " inserted");
        } catch (SQLException ex) {
            System.out.println("Error while inserting into Dataset table: " + ex.getMessage());
        }
    }
     
     public static void insertOrgActivityType(String code, String title, String description, String language){
        
        Connection connection = DB.getConnection();
        
        String sql = "INSERT INTO activityType (actCode, actTitle, actDescription, actLanguage) VALUES"
                + "("
                    + "'" + code + "',"
                    + "'" + title + "',"
                    + "'" + description + "',"
                    + "'" + language + "'"
                + ")";
        
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Activity Type "+ code + " inserted");
        } catch (SQLException ex) {
            System.out.println("Error while inserting into Activity Type table: " + ex.getMessage());
        }
    }
     
     
     
     public static void batchInsertTopics(ArrayList<String> input){
         for(String currentLine : input){
             String[] lineArray = currentLine.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1 );
             
             
             int rcn;
             String code;
             String title;
             String language;
             
             if(!lineArray[0].equals("")){
                  rcn = Integer.parseInt(lineArray[0]);
             } else{
                 rcn = 0;
             }
             
             code = lineArray[1];
             title = lineArray[2];
             language = lineArray[3];
             
          
             insertTopics(rcn, code, title, language);
         }
         
     }
     
     
     public static void batchInsert(ArrayList<String> input){
         
         try{
             for(String currentLine : input){
             String[] lineArray = currentLine.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1 );
             
             int rcn;
             int proId;
             int orgId;
             double ecCont;
             if(!lineArray[0].equals("")){
                 rcn = Integer.parseInt(lineArray[0]);
             } else{
                 rcn = 0;
             }
             
             if(!lineArray[1].equals("")){
                  proId = Integer.parseInt(lineArray[1]);
             } else{
                 proId = 0;
             }
             
             String acronym = lineArray[2];
             
             String role = lineArray[3];
             orgId = Integer.parseInt(lineArray[4]);
             
             String name = lineArray[5];
             String sName = lineArray[6];
             String act = lineArray[7];
             String end = lineArray[8];
             if(!lineArray[9].equals("")){
                  ecCont = Double.parseDouble(lineArray[9]);
             } else{
                 ecCont = 0;
             }
             String country = lineArray[10];
             String street = lineArray[11];
             String city = lineArray[12];
                         
            
            
             String pCode = lineArray[13];
              String url = lineArray[14];
             String vat = lineArray[15];
             String contact = lineArray[16];
             
             
             
             
             insertDataset(proId, rcn, acronym, role,orgId, name, sName, act, end, ecCont, country, street, city, pCode, url, vat, contact);
             
         }
             
         } catch(Exception e){
             System.out.println("Problem" + e.getMessage());
         }
         
     }
    
     public static void batchInsertProjects(ArrayList<String> input){
          Connection con = DB.getConnection();
          
         
          // or any appllication default value 
         try { 
             for(String currentLine : input){
             String[] lineArray = currentLine.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
             int ID;
             int rcn;
             double totalCost;
             double ecMax;
             if(!lineArray[1].equals("")){
                  ID = Integer.parseInt(lineArray[1]);
             } else{
                 ID = 0;
             }
              
             if(!lineArray[0].equals("")){
                  rcn = Integer.parseInt(lineArray[0]);
             } else{
                 rcn = 0;
             }
             String acrnm = lineArray[2];
             String status = lineArray[3];
             String program = lineArray[4];
             String topics = lineArray[5];
             String fProgram = lineArray[6];
             String title = lineArray[7];
             String sDate = lineArray[8];
             String fDate = lineArray[9];
             String Url = lineArray[10];
             String objective = lineArray[11];
             if(!lineArray[12].equals("")){
                  totalCost = Double.parseDouble(lineArray[12]);
             } else{
                 totalCost = 0;
             }
             
             if(!lineArray[13].equals("")){
                  ecMax = Double.parseDouble(lineArray[13]);
             } else{
                 ecMax = 0;
             }
             
             String call = lineArray[14];
             String fsCode = lineArray[15];
             String proCoordinator = lineArray[16];
             String proCoCountry = lineArray[17];
             String proParticipants = lineArray[18];
             String proPaCountry = lineArray[19];
             String proSubjects = lineArray[20];
             
             
             insertProjects(ID, rcn, acrnm, status, program, topics, fProgram, title, sDate, fDate, Url, objective, totalCost, ecMax, call, fsCode, proCoordinator, proCoCountry, proParticipants, proPaCountry, proSubjects);
         } 
         } catch (NumberFormatException nfe) 
            { nfe.printStackTrace(); }


         
         
    }
     
     public static void batchInsertFS(ArrayList<String> input){
          Connection con = DB.getConnection();
          
         
          // or any appllication default value 
         try { 
             for(String currentLine : input){
             String[] lineArray = currentLine.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
             String code = lineArray[1];
             String title = lineArray[2];
             String language = lineArray[4];
             
             insertFS(code, title, language);
         } 
         } catch (NumberFormatException nfe) 
            { nfe.printStackTrace(); }


         
         
    }
     
     
    public static void showFundingScheme(){
        
        
        Connection con = DB.getConnection();
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from fundingScheme ");

            int n = 0;
            while (rs.next()) {
                int numColumns = rs.getMetaData().getColumnCount();
                n++;
                for (int i = 1; i <= numColumns; i++) {
                    System.out.print(" " + rs.getObject(i));
                }

                System.out.println("");
            }

            rs.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
        }

    
    }
    
    public static void showProjects(){
        
        
        Connection con = DB.getConnection();
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from projects ");

            int n = 0;
            while (rs.next()) {
                int numColumns = rs.getMetaData().getColumnCount();
                n++;
                for (int i = 1; i <= numColumns; i++) {
                    System.out.print(" " + rs.getObject(i));
                }

                System.out.println("");
            }

            rs.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
        }

    
    }
    
    public static void showDataset(){
        
        
        Connection con = DB.getConnection();
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from dataset ");

            int n = 0;
            while (rs.next()) {
                int numColumns = rs.getMetaData().getColumnCount();
                n++;
                for (int i = 1; i <= numColumns; i++) {
                    System.out.print(" " + rs.getObject(i));
                }

                System.out.println("");
            }

            rs.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
        }

    
    }
    
    public static void showActivityType(){
        
        
        Connection con = DB.getConnection();
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from activityType ");

            int n = 0;
            while (rs.next()) {
                int numColumns = rs.getMetaData().getColumnCount();
                n++;
                for (int i = 1; i <= numColumns; i++) {
                    System.out.print(" " + rs.getObject(i));
                }

                System.out.println("");
            }

            rs.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
        }

    
    }
    
    public static void showOrganisations(){
        
        
        Connection con = DB.getConnection();
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from organisations ");

            int n = 0;
            while (rs.next()) {
                int numColumns = rs.getMetaData().getColumnCount();
                n++;
                for (int i = 1; i <= numColumns; i++) {
                    System.out.print(" " + rs.getObject(i));
                }

                System.out.println("");
            }

            rs.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
        }

    
    }
    
    public static void showTopics(){
        
        
        Connection con = DB.getConnection();
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from topics ");

            int n = 0;
            while (rs.next()) {
                int numColumns = rs.getMetaData().getColumnCount();
                n++;
                for (int i = 1; i <= numColumns; i++) {
                    System.out.print(" " + rs.getObject(i));
                }

                System.out.println("");
            }

            rs.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
        }

    
    }
    
        
        
    
    
    public static void updateProjects(int id, int rcn, String acrnm, String status, String program, String topics, String fProgram, String title, String sDate, String fDate, String Url, String objective, double totalCost, double ecMax, String call, String fsCode, String proCoordinator, String proCoCountry, String proParticipants, String proPaCountry, String proSubjects){
        
        Connection connection = DB.getConnection();
        
        String sql = "UPDATE projects SET proRcn = '" + rcn + "', proAcronym = '" + acrnm + "', proStatus = '" + status + "', proPrgrm = '" + program + "', proTopics = '" + topics + "', proFrmwrkPrgrm = '" + fProgram + "', proTitle = '" + title + "', proStartDate = '" + sDate + "', proEndDate = '" + fDate + "', proUrl = '" + Url + "', proObjective = '" + objective + "', proTotalCost = '" + totalCost + "', proEcMax = '" + ecMax + "', proCall = '" + call + "', fsCode = '" + fsCode + "', proCoordinator = '" + proCoordinator + "', proCoCountry = '" + proCoCountry + "', proParticipants = '" + proParticipants + "', proParCountry = '" + proPaCountry + "', proSubjects = '" + proSubjects + "' WHERE proId = " + id;
        
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("New project "+ title + " inserted");
        } catch(SQLException ex){
            System.out.println("Error updating Project table" + ex.getMessage());
        }
    }
    
    public static void updateOrganisations(int proId, int rcn, String acrnm, String role, int orgId, String name, String sName, String actType, String endPart, double ecCont, String country, String street, String city, String postCode, String orgUrl, String vatNum, String contactForm){
        
        Connection connection = DB.getConnection();
        
        String sql = "UPDATE organisations SET proRcn = '" + rcn + "', proId = '" + proId + "', proAcronym = '" + acrnm + "', orgRole = '" + role + "', orgName = '" + name + "', orgSname = '" + sName + "', orgActivityType = '" + actType+ "', orgEndPart = '" + endPart + "', orgEcCont = '" + ecCont + "', orgCountry = '" + country + "', orgStreet = '" + street + "', orgCity = '" + city + "', orgPcode = '" + postCode + "', orgUrl = '" + orgUrl + "', orgVat = '" + vatNum + "', orgContactForm = '" + contactForm + "' WHERE orgId = " + orgId;
        
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("New organisation "+ sName + " inserted");
        } catch(SQLException ex){
            System.out.println("Error updating Organisations table" + ex.getMessage());
        }
    }
    
    public static void updateTopics(int topRcn, String code, String title, String language){
        
        Connection connection = DB.getConnection();
        
        String sql = "UPDATE topics SET topCode = '" + code + "', topTitle = '" + title + "', topLanguage = '" + language + "' WHERE topRcn = " + topRcn;
        
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("New topic "+ code + " inserted");
        } catch(SQLException ex){
            System.out.println("Error updating Topics table" + ex.getMessage());
        }
    }
    
    public static void updateDataset(int proId, int rcn, String acrnm, String role, int orgId, String name, String sName, String actType, String endPart, double ecCont, String country, String street, String city, String postCode, String orgUrl, String vatNum, String contactForm){
        
        Connection connection = DB.getConnection();
        
        String sql = "UPDATE dataset SET proId = '" + proId + "', proRcn = '" + rcn + "', proAcronym = '" + acrnm + "', dataRole = '" + role + "', orgName = '" + name + "', orgSname = '" + sName + "', orgActivityType = '" + actType + "', orgEndPart = '" + endPart + "', orgEcCont = '" + ecCont + "', orgCountry = '" + country + "', orgStreet= '" + street + "', orgCity= '" + city + "', orgPcode= '" + postCode + "', orgUrl= '" + orgUrl +  "', orgVat= '" + vatNum +  "', orgContactForm= '" + contactForm + "' WHERE dataId = " + orgId;
        
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("New data "+ sName + " inserted");
        } catch(SQLException ex){
            System.out.println("Error updating Dataset table" + ex.getMessage());
        }
    }
    
    public static void updateOrgActivityType(String code, String title, String description, String language){
        
        Connection connection = DB.getConnection();
        
        String sql = "UPDATE activityType SET actTitle = '" + title + "', actDescription = '" + description + "', actLanguage = '" + language + "' WHERE actCode = " + code;
        
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("New Activity Type "+ code + " inserted");
        } catch(SQLException ex){
            System.out.println("Error updating Activity Type table" + ex.getMessage());
        }
    }
    
    public static void deleteFundingScheme(int id){
        
        Connection connection = DB.getConnection();
        
        String sql = "DELETE FROM fundingScheme WHERE fsId = " + id;
        
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Funding Scheme Object with id "+ id + " deleted.");
        } catch(SQLException ex){
            System.out.println("Error while deleting from Funding Scheme table" + ex.getMessage());
        }
    }
    
    public static void deleteProject(int id){
        
        Connection connection = DB.getConnection();
        
        String sql = "DELETE FROM projects WHERE proId = " + id;
        
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Project with id "+ id + " deleted.");
        } catch(SQLException ex){
            System.out.println("Error while deleting from Projects table" + ex.getMessage());
        }
    }
    
    public static void deleteOrganisation(int id){
         
        Connection connection = DB.getConnection();
        
        String sql = "DELETE FROM organisations WHERE orgId = " + id;
        
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Organisation with id "+ id + " deleted.");
        } catch(SQLException ex){
            System.out.println("Error while deleting from Organisation table" + ex.getMessage());
        }
    }
    
    
    public static void deleteDataset(int id){
        
        Connection connection = DB.getConnection();
        
        String sql = "DELETE FROM dataset WHERE dataId = " + id;
        
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Data with id "+ id + " deleted.");
        } catch(SQLException ex){
            System.out.println("Error while deleting from Dataset table" + ex.getMessage());
        }
    }
    
    
    public static void deleteOrgActivityType(String code){
        
        Connection connection = DB.getConnection();
        
        String sql = "DELETE FROM activityType WHERE actCode = " + code;
        
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Activity Type with code "+ code + " deleted.");
        } catch(SQLException ex){
            System.out.println("Error while deleting from Activity Type table" + ex.getMessage());
        }
    }
    
    
    public static void deleteTopics(int rcn){
        
        Connection connection = DB.getConnection();
        
        String sql = "DELETE FROM topics WHERE topRcn = " + rcn;
        
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Topic with rcn "+ rcn + " deleted.");
        } catch(SQLException ex){
            System.out.println("Error while deleting from Topics table" + ex.getMessage());
        }
    }
    
    
    
}
