/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Class to hold methods to communicate with the database. Abstract to work for 
 * all types of objects needed to push to database. 
 * @author crs0050
 */
public abstract class Push implements DatabaseOperations {
    
    //http://www.sqlitetutorial.net/sqlite-java/insert/
    //abstract void insert () ;
    
    /**
     * Method to create a connection to the database in order to push information
     * into the database.
     * @return 
     */
    public Connection connect () {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/CS 321/sqlite/shadeDB.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
}
