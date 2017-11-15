/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
    private String name, email, phonenum;
    private Vehicle vehicle;
    private Boolean isDriver;
    
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
    Profile(){
    
    }
    
    Profile(Schedule S, String N, String E, String P, Vehicle V, Boolean D){
        mySchedule = S;
        name = N;
        email = E;
        phonenum = P;
        vehicle = V;
        isDriver = D;
    }
    
    /**
     * Method to return schedule from a given profile.
     * @return 
     */
    Schedule getSchedule(){
        return mySchedule;
    }
    
    /**
     * Method to return name from a given profile.
     * @return 
     */
    String getName(){
        return name;
    }
    
    /**
     * Method to return email from a given profile.
     * @return 
     */
    String getEmail(){
        return email;
    }
    
    /**
     * Method to return phone number from a given profile.
     * @return 
     */
    String getPhoneNumber(){
        return phonenum;
    }
    
    /**
     * Method to return vehicle from a given profile.
     * @return 
     */
    Vehicle getVehicle(){
        return vehicle;
    }
    
    /**
     * Method to return a boolean depicting if the profile is set 
     * to be a driver or rider.
     * @return 
     */
    Boolean getDriver(){
        return isDriver;
    }
    
    /**
     * Method to change schedule stored in a given profile.
     * Pass in a schedule object.
     * @param newSchedule 
     */
    void changeSchedule(Schedule newSchedule){
        mySchedule = newSchedule;
    }
    
    /**
     * Method to change name stored in a given profile.
     * Pass in a string.
     * @param newName 
     */
    void changeName(String newName){
        name = newName;
    }
    
    /**
     * Method to change email in a given profile.
     * Pass in a string.
     * @param newEmail 
     */
    void changeEmail(String newEmail){
        email = newEmail;
    }
    
    /**
     * Method to change phone number in a given profile.
     * Pass in a string.
     * @param newPhoneNum 
     */
    void changePN(String newPhoneNum){
        phonenum = newPhoneNum;
    }
    
    /**
     * Method to change vehicle in a given profile. 
     * Pass in a vehicle object.
     * @param newVehicle 
     */
    void changeVehicle(Vehicle newVehicle){
        vehicle = newVehicle;
    }
    
    /**
     * Method to change driver status in a given profile.
     * Pass in a boolean.
     * @param newDriver 
     */
    void changeDriver(Boolean newDriver){
        isDriver = newDriver;
    }
}
