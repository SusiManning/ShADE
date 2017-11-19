/*
 * Program Name: Login
 * Programmers: Michael David
 * Date Last Edited: 11/19/2017
 * Description: Class to control user login process.
 */
package DataModel;
import java.util.Scanner; 

public class Login {
    
    /*
     * The username and password fields.
     */
    private String userName, password;
    
    /*
     * Default constructor for Login class
     */
    public Login(){}    
   
    /*
     * Method to set username.
     * @param user 
     */
    void setUser(String user){
        userName = user;
    }
    
    /*
     * Method to set password.
     * @param pass 
     */
    void setPass(String pass){
        password = pass; 
    }
    
    /*
     * Method to return username.
     * @return 
     */
    String getUser(){
        return userName;
    }
    
    /*
     * Method to return password.
     * @return 
     */
    String getPass(){
        return password; 
    } 
}
