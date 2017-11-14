/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModel;

/**
 * Class to set and manipulate information about a course.
 * @author Michael
 */
public class Course {
    private int courseID;
    private String courseName; //I dont know if this is needed
    private String location; 
    private String time; 
    private String days;
    
    /**
     * Constructor for Course class. Allows users to pass in id, class name, 
     * class location, class start time, and class days.
     * @param id
     * @param name
     * @param place
     * @param t
     * @param d 
     */
    public Course(int id, String name, String place, String t, String d)
    {
        courseID = id;
        courseName = name;
        location = place; 
        time = t;
        days = d;
    }
    
    /**
     * Constructor for Course Class. Sets values to defaults so that 
     * they can be changed individually.
     */
    public Course() 
    {
        courseID = 0;
        courseName = "Default";
        location = "Default";
        time = "Default";
        days = "Default";
    } 
    
    /**
     * Method to set course information to created course object. 
     * User passes in id, class name, class location, 
     * class start time, and class meeting days.
     * @param id
     * @param name
     * @param place
     * @param t
     * @param d 
     */
    public void setCourse(int id, String name, String place, String t, String d)
    {
        courseID = id;
        courseName = name;
        location = place; 
        time = t;
        days = d;
    }
    
    /**
     * Method to set an existing course object's id.
     * Pass in an integer.
     * @param id 
     */
    public void setCourseID(int id)
    {
        courseID = id;
    }
    
    /**
     * Method to set existing course object's name.
     * Pass in a string.
     * @param name 
     */
    public void setCourseName(String name)
    {
        courseName = name; 
    }
    
    /**
     * Method to set existing course object's location.
     * Pass in a string.
     * @param place 
     */
    public void setCourseLocation(String place)
    {
        location = place;
    }
    
    /**
     * Method to set existing course object's start time.
     * Pass in a string.
     * @param t 
     */
    public void setCourseTime(String t)
    {
        time = t; 
    }
    
    /**
     * Method to set existing course object's meeting days.
     * Pass in a string.
     * @param d 
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
     * Method to return existing course object's name.
     * @return 
     */
    public String getCourseName()
    {
        return courseName; 
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
