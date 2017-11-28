/*
 * Program Name: Controller
 * Programmers: Cailin Simpson
 * Date Last Edited: 11/28/2017
 * Description: Class to hold methods necessary to retrieve information from the database.
 */
package Controller;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
