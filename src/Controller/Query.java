/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class to hold methods necessary to retrieve information from the database.
 * @author crs0050
 */
public abstract class Query implements DatabaseOperations {
    
    //http://www.sqlitetutorial.net/sqlite-java/select/
    //abstract String selectAll ();
    
    /**
     * Method to create connection to database in order to retrieve information.
     * @return 
     */
    public Connection connect () {
        Connection conn = null;
        try {
            File file = new File("shadeDB.db"); // Set file needed to access
            String url = file.getAbsolutePath(); // Get computer's path to file
            url = ("jdbc:sqlite:" + url); // Add necessary prefix to path string
            System.out.print(url); // Print url for testing purposes
            // db parameters
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");
            
            return conn;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return conn;
        }
    }

}
