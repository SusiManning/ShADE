/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModel;
import java.util.*;
/**
 * Class to manipulate schedule objects
 * @author Michael
 */
public class Schedule extends Course{
    //Array List of Course
    public ArrayList<Course> sched = new ArrayList<>();
    
    /**
     * Constructor for schedule class.
     */
    public Schedule()
    {  
    }
    
    /**
     * Method to add a course to schedule.
     * @param x 
     */
    public void addCourse(Course x)
    {
        sched.add(x);
    }
    /**
     * Method to return current schedule.
     * @return 
     */
    public ArrayList<Course> getSchedule()
    {
        return sched;
    }
    
    /**
     * Method to return specific course from current schedule.
     * @param index
     * @return 
     */
    public Course getCourse(int index)
    {
        return sched.get(index);
    }
    
}
