/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CW2Group4;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Saitama
 */
public class Tables {
    
    public static void createAddress(){
        Connection con = DB.getConnection();
        Statement stmt = null;
        String createString;
        createString = "CREATE TABLE if not exists address (\n"
                + "            locationId     INTEGER      PRIMARY KEY,\n"
                + "            country  VARCHAR (3),\n"
                + "            city  VARCHAR (25),\n"
                + "            postcode  VARCHAR (15),\n"
                + "            street  VARCHAR (50)\n" + ") ;";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(createString);
            con.commit();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
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
    
    public static void createFundingScheme(){
        Connection con = DB.getConnection();
        Statement stmt = null;
        String createString;
        createString = "CREATE TABLE if not exists fundingScheme (\n"
              
                + "            fsCode  VARCHAR (30),\n"
                + "            fsTitle  TEXT,\n"
           
                + "            fsLanguage  VARCHAR (2)\n" + ") ;";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(createString);
            con.commit();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
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
    
    public static void createProjects(){
        Connection con = DB.getConnection();
        Statement stmt = null;
        String createString;
        createString = "CREATE TABLE if not exists projects (\n"
                + "            proId INTEGER  PRIMARY KEY,\n"
                + "            proRcn  INTEGER,\n"
                + "            proAcronym VARCHAR(30),\n"
                + "            proStatus VARCHAR(12),\n"
                + "            proPrgrm VARCHAR(75),\n"
                + "            proTopics VARCHAR(75),\n"
                + "            proFrmwkPrgrm VARCHAR(50),\n"
                + "            proTitle TEXT,\n"
                + "            proStartDate VARCHAR(10),\n"
                + "            proEndDate VARCHAR(10),\n"
                + "            proUrl VARCHAR(2083),\n"
                + "            proObjective TEXT,\n"
                + "            proTotalCost DECIMAL(10,2),\n"
                + "            proEcMax DECIMAL(10,2),\n"
                + "            proCall VARCHAR(50),\n"
                + "            fsCode VARCHAR (30),\n"
                + "            proCoordinator  TEXT,\n" 
                + "            proCoCountry VARCHAR(3),\n"
                + "            proParticipants VARCHAR(150),\n"
                + "            proParCountry VARCHAR(75),\n"
                + "            proSubjects TEXT\n" + ") ;";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(createString);
            con.commit();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
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
    
    public static void createOrganisations(){
        Connection con = DB.getConnection();
        Statement stmt = null;
        String createString;
        createString = "CREATE TABLE if not exists organisations (\n"
                + "            proId INTEGER,\n"
                + "            proRcn  INTEGER,\n"
                + "            proAcronym VARCHAR(30),\n"
                + "            orgRole VARCHAR(12),\n"
                + "            orgId INTEGER,\n"
                + "            orgName VARCHAR(100),\n"
                + "            orgSname VARCHAR(50),\n"
                + "            orgActivityType VARCHAR(4),\n"
                + "            orgEndPart VARCHAR(10),\n"
                + "            orgEcCont DECIMAL(15,2),\n"
                + "            orgCountry VARCHAR(3),\n"
                + "            orgStreet VARCHAR(100),\n"
                + "            orgCity VARCHAR(60),\n"
                + "            orgPcode VARCHAR(12),\n"
                + "            orgUrl VARCHAR(2083),\n"
                + "            orgVat VARCHAR (30),\n"
                + "            orgContactForm  VARCHAR(100)\n" 
                + ") ;";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(createString);
            con.commit();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
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
    
    public static void createTopics(){
        Connection con = DB.getConnection();
        Statement stmt = null;
        String createString;
        createString = "CREATE TABLE if not exists topics (\n"
                + "            topRcn INTEGER,\n"
                + "            topCode VARCHAR(50),\n"
                + "            topTitle TEXT,\n"
                + "            topLanguage VARCHAR(2)\n" 
                + ") ;";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(createString);
            con.commit();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
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
    
    public static void createDataset(){
        Connection con = DB.getConnection();
        Statement stmt = null;
        String createString;
        createString = "CREATE TABLE if not exists dataset (\n"
                + "            proId INTEGER,\n"
                + "            proRcn  INTEGER,\n"
                + "            proAcronym VARCHAR(30),\n"
                + "            dataRole VARCHAR(15),\n"
                + "            dataId INTEGER ,\n"
                + "            orgName TEXT,\n"
                + "            orgSname VARCHAR(50),\n"
                + "            orgActivityType VARCHAR(4),\n"
                + "            orgEndPart VARCHAR(10),\n"
                + "            orgEcCont DECIMAL(15,2),\n"
                + "            orgCountry VARCHAR(3),\n"
                + "            orgStreet VARCHAR(100),\n"
                + "            orgCity VARCHAR(60),\n"
                + "            orgPcode VARCHAR(12),\n"
                + "            orgUrl VARCHAR(2083),\n"
                + "            orgVat VARCHAR (30),\n"
                + "            orgContactForm  VARCHAR(100)\n" 
                + ") ;";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(createString);
            con.commit();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
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
    
    public static void createorgActivityType(){
        Connection con = DB.getConnection();
        Statement stmt = null;
        String createString;
        createString = "CREATE TABLE if not exists activityType (\n"
                + "            actCode VARCHAR(4),\n"
                + "            actTitle TEXT,\n"
                + "            actDescription TEXT,\n"
                + "            actLanguage VARCHAR(2)\n" 
                + ") ;";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(createString);
            con.commit();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
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

                    
        
    }
    

