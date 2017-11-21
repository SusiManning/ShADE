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
 * Class to communicate between GUI and database to edit an existing account account. 
 * @author slm0041
 */
public class ProfileEdit extends Push {
    
    /**
     * Constructor for profile edit class.
     */
    public ProfileEdit (){
    
    }
    
    /**
     * Method to edit a user's account. Using sqlite syntx, student's id, along with an updated name, email,
     * and phonenum are passed in and updated in the database table.
     * @param id
     * @param  first_name
     * @param  last_name
     * @param  email
     * @param  phone
     */
    public void edit(int id, String first_name, String last_name, String email, String phone){
        String sql = "UPDATE profiles SET first_name = ?, last_name = ?, email = ?, phone = ? WHERE student_id = ?";

        try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, first_name);
            pstmt.setString(2, last_name);
            pstmt.setString(3, email);
            pstmt.setString(4, phone);
            pstmt.setInt(5, id);
            
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}