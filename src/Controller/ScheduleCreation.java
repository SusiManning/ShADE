/*
 * Program Name: ScheduleCreation
 * Programmers: Cailin Simpson
 * Date Last Edited: 11/28/2017
 * Description: Class to communicate between GUI and database to create a Schedule.
 */
package Controller;
import DataModel.Course;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ScheduleCreation extends Push {
      
    
    private String location; 
    private String time; 
    private String days;
    private ScheduleCheck check = new ScheduleCheck();
    
    /**
     * Method to add a course
     * @param course 
     */
    
    public void addCourse (Course course){
        location = course.getCourseLocation();
        time = course.getCourseTime();
        days = course.getCourseDays();
        
        int classcreated;
        classcreated = check.checkClass(location, time, days);
        System.out.print(classcreated);
        System.out.print(location);
        System.out.print(time);
        System.out.print(days);
        //only create if class is not in the database already
        if(classcreated == -1){
        
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
    }
    
    /**
     * Method to add a student to a course
     * @param profile_id
     * @param class_id 
     */
    public void addStudentCourse (int profile_id, int class_id){
        
      
        String sql = "INSERT INTO student_classes (student_id, class_id) VALUES (?,?)";

            try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setInt(1, profile_id);
                pstmt.setInt(2, class_id);

                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
    }
    
    
    
    /*
    //testing purposes -> seeing if it works!
    //how it will be called in the GUI
    public static void main(String[] args) {
        ScheduleCreation app = new ScheduleCreation();
        
        Course course = new Course();
        course.setCourseDays("MWF");
        course.setCourseLocation("SST");
        course.setCourseTime("6:30PM");
        app.addCourse(course);
        
        ScheduleCheck test = new ScheduleCheck();
        int i = test.checkClass(
                course.getCourseLocation(),
                course.getCourseTime(),
                course.getCourseDays()
        );
        
        app.addStudentCourse(3,2);
        
        System.out.println(i);
    }
*/
}
