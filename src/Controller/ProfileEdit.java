/*
 * Program Name: ProfileEdit
 * Programmers: Susi Manning
 * Date Last Edited: 11/28/2017
 * Description: Class to communicate between GUI and database to edit an existing account profile.
 */
package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProfileEdit extends Push {
    
    /**
     * Default constructor for profile edit class.
     */
    public ProfileEdit (){}
    
    /**
     * Method to edit a user's account. Using sqlite syntx, student's id, along with an updated name, email,
     * and phonenum are passed in and updated in the database table.
     * @param id Profile ID of the user
     * @param  first_name First name given by the user
     * @param  last_name Last name given by the user
     * @param  email Email given by the user
     * @param  phone Phone number given by the user
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
