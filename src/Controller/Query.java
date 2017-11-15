/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

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
            // db parameters
            String url = "jdbc:sqlite:C://CS 321/sqlite/shadeDB.db";
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
