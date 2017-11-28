/**
 * Program Name: Course
 * Programmers: Michael David
 * Date Last Edited: 11/19/2017
 * Description: Class to set and manipulate information about a course.
 */

package DataModel;

/**
 * Method to hold course contents
 * @author elizadellert
 */
public class Course {
    private int courseID;
    private String location, time, days;
    
    /**
     * Default constructor for Course Class.
     */
    public Course() {} 
    
    /**
     * Constructor for Course class. Allows users to pass in id, class name, 
     * class location, class start time, and class days.
     * @param id course ID integer
     * @param place course location as a string
     * @param t course time as a string
     * @param d course day as a string 
     */
    public Course(int id, String place, String t, String d)
    {
        courseID = id;
        location = place; 
        time = t;
        days = d;
    }
       
    /**
     * Method to set course information to created course object. 
     * User passes in id, class name, class location, 
     * class start time, and class meeting days.
     * @param id course ID integer
     * @param place course location as a string
     * @param t course time as a string
     * @param d course day as a string 
     */
    public void setCourse(int id, String place, String t, String d)
    {
        courseID = id;
        location = place; 
        time = t;
        days = d;
    }
    
    /**
     * Method to set an existing course object's id.
     * Pass in an integer.
     * @param id course ID integer
     */
    public void setCourseID(int id)
    {
        courseID = id;
    }
    
    /**
     * Method to set existing course object's location.
     * Pass in a string.
     * @param place course location as a string
     */
    public void setCourseLocation(String place)
    {
        location = place;
    }
    
    /**
     * Method to set existing course object's start time.
     * Pass in a string.
     * @param t course time as a string
     */
    public void setCourseTime(String t)
    {
        time = t; 
    }
    
    /**
     * Method to set existing course object's meeting days.
     * Pass in a string.
     * @param d course day as a string
     */
    public void setCourseDays(String d)
    {
        days = d;
    }
    
    /**
     * Method to return existing course object's id.
     * @return 
     */
    public int getCourseID()
    {
        return courseID;
    }
    
    /**
     * Method to return existing course object's location.
     * @return 
     */
    public String getCourseLocation()
    {
        return location;
    }
    
    /**
     * Method to return existing course object's start time.
     * @return 
     */
    public String getCourseTime()
    {
        return time; 
    }
    
    /**
     * Method to get existing course object's meeting days.
     * @return 
     */
    public String getCourseDays()
    {
        return days;
    }
}
