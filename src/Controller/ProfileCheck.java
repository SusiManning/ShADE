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
public class ProfileCheck extends Query {
    
    /**
     * Constructor for login class.
     */
    ProfileCheck () {}
    
    /**
     * Check if username and password are in the database. Using sqlite syntax
     * a connection to the database is initialized, and a statement is prepared
     * to look for the profile id corresponding to the inputs. Loops through all
     * results to find corresponding id.
     * @param profile_id
     */
    public void check(int profile_id){
        String sql = "SELECT first_name, last_name, email, phone FROM profiles " +
                "WHERE student_id=?";
        
        //Test cases
        String first_name = "Steve";
        String last_name = "Steve";
        String email = "Steve@steve.com";
        String phone = "1800Steve";
        
        //connect to database (inherited from Query)
        Connection conn = connect();
        System.out.print("Yas\n");
        try (PreparedStatement pstmt  = conn.prepareStatement(sql)){
           
            // set the values in the sql command
            pstmt.setInt(1, profile_id);
 
            ResultSet rs  = pstmt.executeQuery();
            
            // loop through the result set
            /*while (rs.next()){
                profileid = rs.getInt(1);
            }*/
            first_name = rs.getString(1);
            last_name = rs.getString(2);
            email = rs.getString(3);
            phone= rs.getString(4);
            
            System.out.println(first_name);
            System.out.println(last_name);
            System.out.println(email);
            System.out.println(phone);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        ProfileCheck app = new ProfileCheck();

        app.check(1);
    }
}
