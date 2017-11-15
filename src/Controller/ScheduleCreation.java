/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import DataModel.Course;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author caili
 */

public class ScheduleCreation extends Push {
    private String courseName; //I dont know if this is needed
    private String location; 
    private String time; 
    private String days;
    
    public void addCourse (Course course){
        courseName = course.getCourseName();
        location = course.getCourseLocation();
        time = course.getCourseTime();
        days = course.getCourseDays();
        
         String sql = "INSERT INTO classes (building, time, days) VALUES (?,?,?)";

        try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, location);
            pstmt.setString(2, time);
            pstmt.setString(3, days);
            
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    //testing purposes -> seeing if it works!
    //how it will be called in the GUI
    public static void main(String[] args) {
        ScheduleCreation app = new ScheduleCreation();
        
        Course course = new Course();
        course.setCourseDays("MWF");
        course.setCourseLocation("Shelby");
        course.setCourseTime("6:30PM");
        app.addCourse(course);
        
        ScheduleCheck test = new ScheduleCheck();
        int i = test.checkClass(
                course.getCourseLocation(),
                course.getCourseTime(),
                course.getCourseDays()
        );
        System.out.println(i);
    }
}