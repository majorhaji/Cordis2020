/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CW2Group4;


import GUI.Login;
import java.sql.Statement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saitama
 * 
 */


public class Program {
    public static void main(String[] args) {
        //Dashboard dashboard = new Dashboard();
        //dashboard.setVisible(true);
        Login firstGUI = new Login();
        firstGUI.setVisible(true);
    }
    
   /** public static void main(String[] args) {
        
        ArrayList<String> fileContents = CSVReader.readFile("./fundingScheme.csv");
        InsertTable.batchInsertFS(fileContents);
        
        
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Database Menu");
        System.out.println("Press [C] - Create new ");
        System.out.println("Press [D] - Delete ");
        System.out.println("Press [R] - Show all ");
        System.out.println("Press [U] - Update ");
        String choice = s.nextLine();
        
        switch (choice) {
            case "c", "C":
                System.out.println("[1] - Dataset Table, [2] - Projects Table, [3] - Organisations Table");
                String choice2 = s.nextLine();
                switch(choice2){
                    case "1":
                        System.out.println("Pro Id:");
                            int proId = Integer.parseInt(s.nextLine());
                        System.out.println("Rcn:");
                            int rcn = Integer.parseInt(s.nextLine());
                        System.out.println("Acronym:");
                            String acrnm = s.nextLine();
                        System.out.println("Role:");
                            String role = s.nextLine();
                        System.out.println("Org Id:");
                            int orgId = Integer.parseInt(s.nextLine());
                        System.out.println("Name:");
                            String name = s.nextLine();
                        System.out.println("SName:");
                            String sName = s.nextLine();
                        System.out.println("Activity Type:");
                            String actType = s.nextLine();
                        System.out.println("End Participation:");
                            String endPart = s.nextLine();
                        System.out.println("EC Cont:");
                            double ecCont = Double.parseDouble(s.nextLine());
                        System.out.println("Country:");
                            String country = s.nextLine();
                        System.out.println("Street:");
                            String street = s.nextLine();
                        System.out.println("City:");
                            String city = s.nextLine();
                        System.out.println("PostCode:");
                            String postCode = s.nextLine();
                        System.out.println("Url:");
                            String orgUrl = s.nextLine();
                        System.out.println("Vat number:");
                            String vatNum = s.nextLine();
                        System.out.println("Contact Form:");
                            String contactForm = s.nextLine();
                        
                        InsertTable.insertDataset(proId, rcn, acrnm, role, orgId, name, sName,actType,  endPart, ecCont, country, street, city, postCode, orgUrl,  vatNum, contactForm);
                        break;
                    case "2":
                        System.out.println("Pro Id:");
                            proId = Integer.parseInt(s.nextLine());
                        System.out.println("Rcn:");
                            rcn = Integer.parseInt(s.nextLine());
                        System.out.println("Acronym:");
                            acrnm = s.nextLine();
                        System.out.println("Status:");
                            String status = s.nextLine();
                        System.out.println("Program:");
                            String program = s.nextLine();
                        System.out.println("Topics:");
                            String topics = s.nextLine();
                        System.out.println("Framework Program:");
                            String fProgram = s.nextLine();
                        System.out.println("Title:");
                            String title = s.nextLine();
                        System.out.println("Start Date:");
                            String sDate = s.nextLine();
                        System.out.println("End Date:");
                            String fDate = s.nextLine();
                        System.out.println("url:");
                            String url = s.nextLine();
                        System.out.println("Objective:");
                            String objective = s.nextLine();
                            
                        System.out.println("Total Cost:");
                            Double totalCost = Double.parseDouble(s.nextLine());
                            
                            
                        System.out.println("Ec Max Contribution:");
                           
                            ecCont = Double.parseDouble(s.nextLine());
                        System.out.println("Call:");
                            String call= s.nextLine();
                        System.out.println("Funding Scheme Code:");
                            String fsCode = s.nextLine();
                        System.out.println("Coordinators:");
                            String proCo = s.nextLine();
                        System.out.println("Coordinator Countries:");
                            String proCoCountry = s.nextLine();
                        System.out.println("Participants:");
                            String proPar = s.nextLine();
                        System.out.println("Participant Countries:");
                            String proPaCountry = s.nextLine();
                        System.out.println("Subjects:");
                            String proSubjects = s.nextLine();
                        InsertTable.insertProjects(proId, rcn, acrnm, status, program, topics, fProgram, title, sDate, fDate, url, objective, totalCost, ecCont, call, fsCode, proCo, proCoCountry, proPar, proPaCountry, proSubjects);
                        break;
                    case "3":
                        System.out.println("Pro Id:");
                            proId = Integer.parseInt(s.nextLine());
                        System.out.println("Rcn:");
                            rcn = Integer.parseInt(s.nextLine());
                        System.out.println("Acronym:");
                            acrnm = s.nextLine();
                        System.out.println("Role:");
                            role = s.nextLine();
                        System.out.println("org Id:");
                            orgId = Integer.parseInt(s.nextLine());
                        System.out.println("name:");
                            name = s.nextLine();
                        System.out.println("short name:");
                            sName = s.nextLine();
                        System.out.println("activity type:");
                            actType = s.nextLine();
                        System.out.println("End of Participation");
                            endPart = s.nextLine();
                        System.out.println("EC Contribution:");
                            ecCont = Double.parseDouble(s.nextLine());
                        System.out.println("Country:");
                            country = s.nextLine();
                        System.out.println("Street:");
                            street = s.nextLine();
                        System.out.println("City:");
                            city= s.nextLine();
                        System.out.println("PostCode:");
                            postCode = s.nextLine();
                        System.out.println("URL:");
                            orgUrl = s.nextLine();
                        System.out.println("VAT NUM:");
                            vatNum = s.nextLine();
                        System.out.println("Contact Form:");
                            contactForm = s.nextLine();
                            
                        InsertTable.insertOrganisations(proId, rcn, acrnm, role, orgId, name, sName, actType, endPart, ecCont, country, street, city, postCode, orgUrl, vatNum, contactForm);
                        
                        break;
                }
                break;
            case "r", "R":
                System.out.println("[1] - Dataset Table, [2] - Projects Table, [3] - Organisations Table");
                String choice3 = s.nextLine();
                switch(choice3){
                    case "1":
                        InsertTable.showDataset();
                        break;

                    case "2":
                        InsertTable.showProjects();
                        break;
                    case "3":
                        InsertTable.showOrganisations();
                        break;
                }
                break;
               
            case "u", "U":
                System.out.println("[1] - Dataset Table, [2] - Projects Table, [3] - Organisations Table");
                String choice4 = s.nextLine();
                switch(choice4){
                    case "1":
                        System.out.println("Pro Id:");
                            int proId = Integer.parseInt(s.nextLine());
                        System.out.println("Rcn:");
                            int rcn = Integer.parseInt(s.nextLine());
                        System.out.println("Acronym:");
                            String acrnm = s.nextLine();
                        System.out.println("Role:");
                            String role = s.nextLine();
                        System.out.println("Org Id:");
                            int orgId = Integer.parseInt(s.nextLine());
                        System.out.println("Name:");
                            String name = s.nextLine();
                        System.out.println("SName:");
                            String sName = s.nextLine();
                        System.out.println("Activity Type:");
                            String actType = s.nextLine();
                        System.out.println("End Participation:");
                            String endPart = s.nextLine();
                        System.out.println("EC Cont:");
                            double ecCont = Double.parseDouble(s.nextLine());
                        System.out.println("Country:");
                            String country = s.nextLine();
                        System.out.println("Street:");
                            String street = s.nextLine();
                        System.out.println("City:");
                            String city = s.nextLine();
                        System.out.println("PostCode:");
                            String postCode = s.nextLine();
                        System.out.println("Url:");
                            String orgUrl = s.nextLine();
                        System.out.println("Vat number:");
                            String vatNum = s.nextLine();
                        System.out.println("Contact Form:");
                            String contactForm = s.nextLine();
                        
                        InsertTable.updateDataset(proId, rcn, acrnm, role, orgId, name, sName, actType, endPart, ecCont, country, street, city, postCode, orgUrl, vatNum, contactForm);
                        break;
                    case "2":
                        System.out.println("Project Id:");
                            proId = Integer.parseInt(s.nextLine());
                        System.out.println("Rcn:");
                            rcn = Integer.parseInt(s.nextLine());
                        System.out.println("Acronym:");
                            acrnm = s.nextLine();
                        System.out.println("Status:");
                            String status = s.nextLine();
                        System.out.println("Program:");
                            String program = s.nextLine();
                        System.out.println("Topics:");
                            String topics = s.nextLine();
                        System.out.println("Framework Program:");
                            String fProgram = s.nextLine();
                        System.out.println("Title:");
                            String title = s.nextLine();
                        System.out.println("Start Date:");
                            String sDate = s.nextLine();
                        System.out.println("End Date:");
                            String fDate = s.nextLine();
                        System.out.println("url:");
                            String url = s.nextLine();
                        System.out.println("Objective:");
                            String objective = s.nextLine();
                            
                        System.out.println("Total Cost:");
                            Double totalCost = Double.parseDouble(s.nextLine());
                            
                            
                        System.out.println("Ec Max Contribution:");
                           
                            ecCont = Double.parseDouble(s.nextLine());
                        System.out.println("Call:");
                            String call= s.nextLine();
                        System.out.println("Funding Scheme Code:");
                            String fsCode = s.nextLine();
                        System.out.println("Coordinators:");
                            String proCo = s.nextLine();
                        System.out.println("Coordinator Countries:");
                            String proCoCountry = s.nextLine();
                        System.out.println("Participants:");
                            String proPar = s.nextLine();
                        System.out.println("Participant Countries:");
                            String proPaCountry = s.nextLine();
                        System.out.println("Subjects:");
                            String proSubjects = s.nextLine();
                            InsertTable.updateProjects(proId, rcn, acrnm, status, program, topics, fProgram, title, sDate, fDate, url, objective, totalCost, ecCont, call, fsCode, proCo, proCoCountry, proPar, proPaCountry, proSubjects);
                        break;
                    case "3":
                        System.out.println("Pro Id:");
                            proId = Integer.parseInt(s.nextLine());
                        System.out.println("Rcn:");
                            rcn = Integer.parseInt(s.nextLine());
                        System.out.println("Acronym:");
                            acrnm = s.nextLine();
                        System.out.println("Role:");
                            role = s.nextLine();
                        System.out.println("org Id:");
                            orgId = Integer.parseInt(s.nextLine());
                        System.out.println("name:");
                            name = s.nextLine();
                        System.out.println("short name:");
                            sName = s.nextLine();
                        System.out.println("activity type:");
                            actType = s.nextLine();
                        System.out.println("End of Participation");
                            endPart = s.nextLine();
                        System.out.println("EC Contribution:");
                            ecCont = Double.parseDouble(s.nextLine());
                        System.out.println("Country:");
                            country = s.nextLine();
                        System.out.println("Street:");
                            street = s.nextLine();
                        System.out.println("City:");
                            city= s.nextLine();
                        System.out.println("PostCode:");
                            postCode = s.nextLine();
                        System.out.println("URL:");
                            orgUrl = s.nextLine();
                        System.out.println("VAT NUM:");
                            vatNum = s.nextLine();
                        System.out.println("Contact Form:");
                            contactForm = s.nextLine();
                            
                            InsertTable.updateOrganisations(proId, rcn, acrnm, role, orgId, name, sName, actType, endPart, 0, country, street, city, postCode, orgUrl, vatNum, contactForm);
                        break;
                
            
            case "d", "D":
                System.out.println("[1] - Dataset Table, [2] - Projects Table, [3] - Organisations Table");
                String choice5 = s.nextLine();
                
                switch(choice5){
                    case "1":
                        System.out.println("Enter ID: ");
                        int dataId = Integer.parseInt(s.nextLine());
                        
                        InsertTable.deleteDataset(dataId);
                        break;
                    case "2":
                        System.out.println("Enter Project ID: ");
                        int projectId = Integer.parseInt(s.nextLine());
                        
                        InsertTable.deleteProject(projectId);
                        break;
                    case "3":
                        System.out.println("Enter Organisation ID: ");
                        int oId = Integer.parseInt(s.nextLine());
                        
                        InsertTable.deleteOrganisation(oId);
                        break;
                }
                break;
                
           
            default:
            // code block
        }
       
      
        
         
        
        
        
        
        
        
        
       
         
    }
    }
    */
}
    
     
