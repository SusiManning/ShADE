/*
 * To set this license header, choose License Headers in Project Properties.
 * To set this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModel;

/**
 * Programmers: Aaron Wieter
 * Date Last Edited: 9/28/2017
 * Program Description: 
 */
public class Profile {
    private Schedule mySchedule;
    private String firstname, lastname, email, phonenum;
    private Vehicle vehicle;
    private Boolean isDriver;
    private int profile_id;
    
    /**
     * Constructor for Profile class. Sets user defined schedule, name, email, 
     * phone number, vehicle, and preference to be a  driver or rider.
     * @param S
     * @param N
     * @param E
     * @param P
     * @param V
     * @param D 
     */

    public Profile() {
        
    }
    
    /**
     * Method to return schedule from a given profile.
     * @return 
     */
    public Schedule getSchedule(){
        return mySchedule;
    }
    
    /**
     * Method to return name from a given profile.
     * @return 
     */
    public String getFirstName(){
        return firstname;
    }
    
    public String getLastName(){
        return firstname;
    }
    
    /**
     * Method to return email from a given profile.
     * @return 
     */
    public String getEmail(){
        return email;
    }
    
    /**
     * Method to return phone number from a given profile.
     * @return 
     */
    public String getPhoneNumber(){
        return phonenum;
    }
    
    /**
     * Method to return vehicle from a given profile.
     * @return 
     */
    public Vehicle getVehicle(){
        return vehicle;
    }
    
    /**
     * Method to return a boolean depicting if the profile is set 
     * to be a driver or rider.
     * @return 
     */
    public Boolean getDriver(){
        return isDriver;
    }
    
    public int getID(){
        return profile_id;
    }
    
    /**
     * Method to set schedule stored in a given profile.
     * Pass in a schedule object.
     * @param newSchedule 
     */
    public void setSchedule(Schedule newSchedule){
        mySchedule = newSchedule;
    }
    
    /**
     * Method to set name stored in a given profile.
     * Pass in a string.
     * @param newName 
     */
    public void setFirstName(String newName){
        firstname = newName;
    }
    
    public void setLastName(String newName){
        lastname = newName;
    }
    
    /**
     * Method to set email in a given profile.
     * Pass in a string.
     * @param newEmail 
     */
    public void setEmail(String newEmail){
        email = newEmail;
    }
    
    /**
     * Method to set phone number in a given profile.
     * Pass in a string.
     * @param newPhoneNum 
     */
    public void setPN(String newPhoneNum){
        phonenum = newPhoneNum;
    }
    
    /**
     * Method to set vehicle in a given profile. 
     * Pass in a vehicle object.
     * @param newVehicle 
     */
    public void setVehicle(Vehicle newVehicle){
        vehicle = newVehicle;
    }
    
    /**
     * Method to set driver status in a given profile.
     * Pass in a boolean.
     * @param newDriver 
     */
    public void setDriver(Boolean newDriver){
        isDriver = newDriver;
    }
    
    public void setID(int id){
        profile_id = id;
    }
}
