/*
 * Program Name: LoginCreation
 * Programmers: Cailin Simpson
 * Date Last Edited: 11/28/2017
 * Description: Class to communicate between GUI and database to create a login account.
 */
package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginCreation extends Push {
    
    /**
     * Constructor for login creation class.
     */
    public LoginCreation (){
    
    }
    
    /**
     * Method to create a login account. Using sqlite syntx, username, password,
     * and profile id are passed in and set into the database table.
     * @param usrname Username given by the user
     * @param pass Password given by the user 
     * @param profileid an identification number for the users profile
     */
    public void create(String usrname, String pass, int profileid){
        String sql = "INSERT INTO login(username, password, profile_id) VALUES(?,?,?)";

        try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, usrname);
            pstmt.setString(2, pass);
            pstmt.setInt(3, profileid);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /*
    //testing purposes -> seeing if it works!
    //how it will be called in the GUI
    public static void main(String[] args) {
        LoginCreation app = new LoginCreation();
        
        app.create("test", "test", 40);
    }
*/
}
