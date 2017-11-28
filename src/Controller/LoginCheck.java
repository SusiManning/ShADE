/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Class to check login information between GUI and database.
 * @author crs0050
 */


public class LoginCheck extends Query {
    
    
    public LoginCheck () {
    
    }
    
    /**
     * Check what the user's password is in the database. Using sqlite syntax
     * a connection to the database is initialized, and a statement is prepared
     * to look for the password corresponding to the input profile id. Loops through all
     * results to find corresponding password.
     * @param profileid
     * @return 
     */
    public String checkPass(int profileid){
        String sql = "SELECT password FROM login " +
                "WHERE profile_id=?";
        
        String password = "";
        //connect to database (inherited from Query)
        Connection conn = connect();
        
        try (PreparedStatement pstmt  = conn.prepareStatement(sql)){
           
            // set the values in the sql command
            pstmt.setInt(1, profileid);
 
            ResultSet rs  = pstmt.executeQuery();
            
            // loop through the result set
            while (rs.next()){
                password = rs.getString(1); 
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return password;
    }
    
    /**
     * Function to validate the login credentials entered by the user
     * @param username The username provided by the user
     * @param password The password provided by the user
     * @return true if login credentials are valid, false otherwise
     */
    
    public int check(String username, String password){
        int id = logincheck(username, password);
        return id;
    }
    
    /**
     * 
     * @param username The username provided by the user
     * @param password The password provided by the user
     * @return returns a -1 if the login is not within the database
     */
    private int logincheck(String username, String password){
        String sql = "SELECT profile_id FROM login " +
                "WHERE username=? AND password=?";
        int profileid = -1; // if id is not initalized in try, then we 
        //know the login is not in database.

        //connect to database (inherited from Query)
        Connection conn = connect();
        System.out.print("yas");
        try (PreparedStatement pstmt  = conn.prepareStatement(sql)){

            // set the values in the sql command
            pstmt.setString(1, username);
            pstmt.setString(2, password);

            ResultSet rs  = pstmt.executeQuery();

            // loop through the result set
            while (rs.next()){
                profileid = rs.getInt(1); 
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return profileid;
        
    }
    /*
    //testing purposes -> seeing if it works!
    //how it will be called in the GUI
    public static void main(String[] args) {
        LoginCheck app = new LoginCheck();
        
        int id = app.check("test", "test");
        System.out.print(id);
    }
*/
}
