/**
 * Program Name: Schedule
 * Programmers: Michael David
 * Date Last Edited: 11/19/2017
 * Description: Class to manipulate schedule objects
 */
package DataModel;
import java.util.ArrayList;

public class Schedule extends Course{
    
    public ArrayList<Course> sched = new ArrayList<>();      //Array List of Courses.
    
    /**
     * Default constructor for schedule class.
     */
    public Schedule() {}
    
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
