/*
 * Program Name: ProfileCreation
 * Programmers: Aaron Wieter, Cailin Simpson
 * Date Last Edited: 11/28/2017
 * Description: Class to communicate between GUI and database to create a profile account.
 */
package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProfileCreation extends Push {
    
    /**
     * Default constructor for profile creation class.
     */
    public ProfileCreation (){
    
    }
    
    /**
     * Method to create a profile account. Using sqlite syntx, first_name, last_name, email,
     * and phonenum are passed in and set into the database table.
     * @param  first_name First name given by the user
     * @param  last_name Last name given by the user
     * @param  email Email provided by the user
     * @param  phone Phone number provided by the user 
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
