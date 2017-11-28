/*
 * Program Name: Push
 * Programmers: Cailin Simpson
 * Date Last Edited: 11/28/2017
 * Description: Class to hold methods to communicate with the database. Abstract to work for
 * all types of objects needed to push to database.
 */
package Controller;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
            File file = new File("shadeDB.db"); // Set file needed to access
            String url = file.getAbsolutePath(); // Get computer's path to file
            url = ("jdbc:sqlite:" + url); // Add necessary prefix to path string
            System.out.print(url); // Print url for testing purposes
            
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
}
