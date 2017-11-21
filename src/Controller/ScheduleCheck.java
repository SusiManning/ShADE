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
import java.util.ArrayList;

/**
 *
 * @author caili
 */
public class ScheduleCheck extends Query {
    
    private String building; 
    private String time; 
    private String days;
    
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
        int classID = -1;
        try (PreparedStatement pstmt  = conn.prepareStatement(sql)){
           
            // set the values in the sql command
            pstmt.setString(1, building);
            pstmt.setString(2, time);
            pstmt.setString(3, days);
            ResultSet rs  = pstmt.executeQuery();
            
            while(rs.next()){
                classID = rs.getInt(1);
            }
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return classID;
    }
    
    public int checkClass(Course course){
        building = course.getCourseLocation();
        time = course.getCourseTime();
        days = course.getCourseDays();
        //int classID = course.getCourseID();
        
        String sql = "SELECT class_id FROM classes " +
                "WHERE building=? AND time=? AND days=?";
        
        //connect to database (inherited from Query)
        Connection conn = connect();
        int classID = -1;
        try (PreparedStatement pstmt  = conn.prepareStatement(sql)){
            
            // set the values in the sql command
            pstmt.setString(1, building);
            pstmt.setString(2, time);
            pstmt.setString(3, days);
            ResultSet rs  = pstmt.executeQuery();
            
            while(rs.next()){
                classID = rs.getInt(1);
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return classID;
    }
    
    public ArrayList<Profile> checkMatch(int profileID, int classID) {
        Profile profile = null;
        
        ArrayList <Integer> profileIDs = new ArrayList();
        ArrayList <Profile> profiles = new ArrayList();
        
        int student_match; 
        
        String sql = "SELECT student_id, class_id FROM student_classes " +
                "WHERE class_id = ?";
        
        //connect to database (inherited from Query)
        Connection conn = connect();
        try (PreparedStatement pstmt  = conn.prepareStatement(sql)){
           
            // set the values in the sql command
            pstmt.setInt(1, profileID);
            pstmt.setInt(2, classID);
            
            //get results
            ResultSet rs  = pstmt.executeQuery();
            
            //loop to get profileIDs
            while (rs.next()){
                student_match = rs.getInt(1);
                
                //if the current studentID does not equal 
                //the profileID passed
                if (student_match != profileID)
                    //add the matching student
                    profileIDs.add(rs.getInt(1));
            }
            
            for (Integer profileid : profileIDs ){
                profile = getProfileFromClass(profileid); //could use Profile Check class
                profiles.add(profile);
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return profiles;
    }
    
    private Profile getProfileFromClass(int profileID){
        Profile profile = null;
        ProfileCheck check = new ProfileCheck();
        profile = check.check(profileID);
        return profile;
    }
    
    public ArrayList<Course> getSchedule (int profileID){
        ArrayList <Course> schedule = new ArrayList();
        
        String sql = "SELECT student_id, class_id FROM student_classes " +
                "WHERE student_id = ?";
        int class_id;
        ArrayList <Integer> classes = new ArrayList();
        //connect to database (inherited from Query)
        Connection conn = connect();
        try (PreparedStatement pstmt  = conn.prepareStatement(sql)){
           
            // set the values in the sql command
            pstmt.setInt(1, profileID);
            
            //get results
            ResultSet rs  = pstmt.executeQuery();
            
            //loop to get profileIDs
            while (rs.next()){
                classes.add(rs.getInt(1));
            }
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        for (Integer courseid : classes ){
            schedule.add(getCourse(courseid));
        }
        
        return schedule;
    }
    
    private Course getCourse(int course_id) {
        Course course = new Course();
        
        String sql = "SELECT building, time, days FROM classes " +
                "WHERE class_id=?";
        String building, time, days;
        building = "";
        time = "";
        days = "";
        //connect to database (inherited from Query)
        Connection conn = connect();
        try (PreparedStatement pstmt  = conn.prepareStatement(sql)){
           
            // set the values in the sql command
            pstmt.setInt(1, course_id);
            ResultSet rs  = pstmt.executeQuery();
            
            while(rs.next()){
                building = rs.getString(1);
                time = rs.getString(2);
                days = rs.getString(3);
            }
            
            course.setCourseLocation(building);
            course.setCourseTime(time);
            course.setCourseDays(days);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return course;
        
    }
    
    public static void main(String[] args) {
        ScheduleCheck app = new ScheduleCheck();

        int i = app.checkClass("SST", "1:00", "TTh");
        System.out.println(i);
    }
}

