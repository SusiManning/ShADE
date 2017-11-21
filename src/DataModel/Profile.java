/**
 * Program Name: Profile
 * Programmers: Aaron Wieter
 * Date Last Edited: 11/19/2017
 * Program Description: Class that holds and returns all information related to a user's profile.
 */
package DataModel;

public class Profile {                               //Holds the user's schedule.
    private String firstname, lastname, email, phonenum;        //Holds the user's first name, last name, email, and phone number respectively.                                  //Holds the user's vehicle.
    private int profile_id;                                     //Holds the profile id of a user's profile.
    
    /**
     * Default constructor for Profile class.
     */
    public Profile() {}
    

    /**
     * Method to return firstname from a given profile.
     * @return 
     */
    public String getFirstName(){
        return firstname;
    }
    
    /**
     * Method to return lastname from a given profile.
     * @return 
     */
    public String getLastName(){
        return lastname;
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
    
    /**
     *Method to return profile_ide from a given profile.
     * @return profile_id
     */
    public int getID(){
        return profile_id;
    }
    
    /**
     * Method to set schedule stored in a given profile.
     * Pass in a schedule object.
     * @param newSchedule 
     */

    
    /**
     * Method to set firstname stored in a given profile.
     * Pass in a string.
     * @param newName 
     */
    public void setFirstName(String newName){
        firstname = newName;
    }
    
    /**
     * Method to set lastname stored in a given profile.
     * Pass in a string.
     * @param newName 
     */
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
     *Method to set profile_id in a given profile.
     *Pass in an int.
     *@param id
     */
    public void setID(int id){
        profile_id = id;
    }
}
