/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Class to communicate between GUI and database to create a login account. 
 * @author crs0050
 */
public class ProfileCreation extends Push {
    
    /**
     * Constructor for login creation class.
     */
    public ProfileCreation (){
    
    }
    
    /**
     * Method to create a login account. Using sqlite syntx, name, email,
     * and phonenum are passed in and set into the database table.
     * @param  first_name
     * @param  last_name
     * @param  email
     * @param  phone
     */
    public void create(String first_name, String last_name, String email, String phone){
        String sql = "INSERT INTO profiles (first_name, last_name, email, phone) VALUES (?,?,?,?)";

        try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, first_name);
            pstmt.setString(2, last_name);
            pstmt.setString(3, email);
            pstmt.setString(4, phone);
            
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /*
    //testing purposes -> seeing if it works!
    //how it will be called in the GUI
    public static void main(String[] args) {
        ProfileCreation app = new ProfileCreation();
        
        app.create("Bob", "Bob", "Bob@bob.com", "1800Bob");
        System.out.println("Profile created.");
    }
*/
}