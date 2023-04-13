/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CW2Group4;

import com.opencsv.CSVWriter;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Saitama
 */
public class CSVReader {
    
   
    
    
    public static ArrayList<String> readFile(String fileName){
        
        
        ArrayList<String> fileContents = new ArrayList<>();
        
        try{
           
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line = "";
            bufferedReader.readLine();
            while((line = bufferedReader.readLine()) != null){
                fileContents.add(line);
                
                
            }
            
        } catch(Exception e){
            
            System.out.println("Error reading the file: " + e.getMessage());
        }
        return fileContents;
    }
    
    public static void batchInsert(){
        Connection con = DB.getConnection();
        Statement stmt = null;

        try {
            FileInputStream fstream = new FileInputStream("./dataset.csv");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            ArrayList list = new ArrayList();
            ArrayList IdChecker = new ArrayList();
            int count = 0;
            while ((strLine = br.readLine()) != null) {
                //System.out.println("list"+list);
                list.add(strLine);
                count++;
                //System.out.println(count);
            }
            list.remove(0);
            Iterator itr;
            for (itr = list.iterator(); itr.hasNext();) {
                String str = itr.next().toString();
                String[] splitSt = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

               
                    
                    
                    int rcn = Integer.parseInt(splitSt[0]);
                    int id = Integer.parseInt(splitSt[1]);
                    String acronym = splitSt[2];
                    String role = splitSt[3];
                    int dataId = Integer.parseInt(splitSt[4]);
                    String name = splitSt[5];
                    String sName = splitSt[6];
                    String actType = splitSt[7];
                    String endPart = splitSt[8];
                    double ecCont = Double.parseDouble(splitSt[9]);
                    String country = splitSt[10];

                    String street = splitSt[11];
                    String city = splitSt[12];
                    String pCode = splitSt[13];
                    String url = splitSt[14];
                    String vat = splitSt[15];
                    String contactForm = splitSt[16];
                    String sqlString = "INSERT INTO dataset (proId, proRcn, proAcronym,  dataRole, dataId, orgName, orgSname, orgActivityType, orgEndPart,  orgEcCont, orgCountry, orgStreet,  orgCity, orgPcode,  orgUrl, orgVat, orgContactForm) VALUES \n"
                            + "(" + id + "," + rcn + ",'" + acronym + "','" + role+ "'," + dataId+ ",'" + name + "','" + sName + "','" + actType + "','" + endPart+  "'," + ecCont + ",'" + country + "','" + street + "','" +city+ "','" +pCode+ "','" + url+ "','" + vat+ "','" + contactForm + "')";
//                      System.out.println("sqlString : "+ sqlString);
                    con.setAutoCommit(false);
                    stmt = con.createStatement();

                    stmt.executeUpdate(sqlString);
                    stmt.close();
                    con.commit();

                

//                
            }
        } catch (Exception e) {
            System.out.println("error with batch insert " + e.getMessage());
        }

    }
    
}
