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
    
    /**
     * Method to check login accuracy.
     * @param building
     * @param time
     * @param days
     */
    
    private String building; 
    private String time; 
    private String days;
    
    public ScheduleCheck () {
    
    }
    
    //to be used by the ScheduleCreation
    //class and as need to see if a class is
    // in the database
    public int checkClass(String building, String time, String days){
        
     /**
     * Method to check class details.
     * @param building
     * @param time
     * @param days
     * @return classID
     */
        
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
        
     /**
     * Method to check class.
     * @param building
     * @param time
     * @param days
     * @param classID
     * @return classID
     */
        
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
                System.out.print("Printing classID from checkClass: ");
                System.out.println(classID);
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return classID;
    }
    
    public ArrayList<Profile> checkMatch(int profileID, int classID) {
      
     /**
     * Method to check class.
     * @param profile
     * @param profileID
     * @param student_match
     * @param classID
     * @return profile
     */
        
        Profile profile = null;
        
        ArrayList <Integer> profileIDs = new ArrayList();
        ArrayList <Profile> profiles = new ArrayList();
        
        int student_match; 
        
        String sql = "SELECT student_id FROM student_classes " +
                "WHERE class_id = ?";
        
        //connect to database (inherited from Query)
        Connection conn = connect();
        try (PreparedStatement pstmt  = conn.prepareStatement(sql)){
           
            // set the values in the sql command
            pstmt.setInt(1, classID);
            System.out.print(classID);
            //get results
            ResultSet rs  = pstmt.executeQuery();
            
            //loop to get profileIDs
            while (rs.next()){
                student_match = rs.getInt(1);
                System.out.print(student_match);
                //if the current studentID does not equal 
                //the profileID passed
                if (student_match != profileID)
                    //add the matching student
                    profileIDs.add(rs.getInt(1));
                System.out.print(profileID + " number 2");
            }
            
            for (Integer profileid : profileIDs ){
                profile = getProfileFromClass(profileid); //could use Profile Check class
                System.out.print("Profile: " + profileid);
                profiles.add(profile);
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return profiles;
    }
    
    private Profile getProfileFromClass(int profileID){
        
     /**
     * Method to get class.
     * @param profile
     * @param profileID
     * @param student_match
     * @param classID
     * @return profile
     */
        
        Profile profile = null;
        ProfileCheck check = new ProfileCheck();
        profile = check.check(profileID);
        return profile;
    }
    
    public ArrayList <Course> getSchedule (int profileID){
        
     /**
     * Method to get class.
     * @param sql
     * @param class_id
     * @param profileID
     * @return schedule
     */
        
        ArrayList <Course> schedule = new ArrayList();
        
        String sql = "SELECT class_id FROM student_classes " +
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
                System.out.print("printing class id from getSchedule: ");
                System.out.println(rs.getInt(1));
            }
            
            for (Integer courseid : classes ){
            schedule.add(getCourse(courseid));
            }
                     
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return schedule;
    }
    
    private Course getCourse(int course_id) {
        
      /**
     * Method to get course.
     * @param building
     * @param time
     * @param days
     * @param conn
     * @return course
     */
        
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
    
    
    /*
    public static void main(String[] args) {
               
      
     * Method to get course.
     * @param i
     
      
        ScheduleCheck app = new ScheduleCheck();

        int i = app.checkClass("SST", "1:00", "TTh");
        System.out.println(i);
    }
*/
}

