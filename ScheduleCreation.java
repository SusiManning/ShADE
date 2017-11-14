/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import DataModel.Course;

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
    }
}