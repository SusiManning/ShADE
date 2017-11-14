/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModel;
import java.util.Scanner; 

/**
 * Class to control user login process.
 * @author Michael
 */
public class Login {
    
    /**
     * Constructor for Login class
     */
    public Login(){
        
    }
    
    // username, password fields
    private String userName;
    private String password;
   
    /**
     * Method to set username.
     * @param user 
     */
    void setUser(String user){
        userName = user;
    }
    
    /**
     * Method to set password.
     * @param pass 
     */
    void setPass(String pass){
        password = pass; 
    }
    
    /**
     * Method to return username.
     * @return 
     */
    String getUser(){
        return userName;
    }
    
    /**
     * Method to return password.
     * @return 
     */
    String getPass(){
        return password; 
    }
    
   
    

   
  
          
    
    
    
}
