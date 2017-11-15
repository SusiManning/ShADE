/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import DataModel.Profile;
import DataModel.Course;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author caili
 */
public class ScheduleCheck extends Query {
    
    public ScheduleCheck () {
    }
    
    //to be used by the ScheduleCreation
    //class and as need to see if a class is
    // in the database
    public int checkClass(String building, String time, String days){
        String sql = "SELECT class_id FROM classes " +
                "WHERE building=? AND time=? AND days=?";
        
        //connect to database (inherited from Query)
        Connection conn = connect();
        try (PreparedStatement pstmt  = conn.prepareStatement(sql)){
           
            // set the values in the sql command
            pstmt.setString(1, building);
            pstmt.setString(2, time);
            pstmt.setString(3, days);
            ResultSet rs  = pstmt.executeQuery();
            
            int classID = rs.getInt(1);
            
            return classID;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }
    
    public Profile checkMatch(int profileID, int classID) {
        Profile profile = null;
        
        String sql = "SELECT student_id, class_id FROM student_classes " +
                "WHERE class_id = ?";
        
        //connect to database (inherited from Query)
        Connection conn = connect();
        try (PreparedStatement pstmt  = conn.prepareStatement(sql)){
           
            // set the values in the sql command
            //pstmt.setString(1, building);
            //pstmt.setString(2, time);
            //pstmt.setString(3, days);
            //ResultSet rs  = pstmt.executeQuery();
            
            //int classID = rs.getInt(1);
            
            //return classID;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return profile;
    }
    
    private Profile getProfileFromClass(int profileID){
        Profile profile = null;
        return profile;
    }
    
    public static void main(String[] args) {
        ScheduleCheck app = new ScheduleCheck();

        int i = app.checkClass("Materials Science Building", "3:15PM", "MWF");
        System.out.println(i);
    }
}

