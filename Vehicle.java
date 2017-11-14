 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModel;
  

/**
 * Programmers: Aaron Wieter
 * Date Last Edited: 9/28/2017
 * Program Description: Class to create and manipulate vehicle objects.
 */
public class Vehicle {
    private String make, model, color;
    
    /**
     * Constructor for create a vehicle with given parameters.
     * @param Make
     * @param Model
     * @param Color 
     */
    Vehicle(String Make, String Model, String Color){
        make = Make;
        model = Model;
        color = Color;
    }
    
    /**
     * Method to get the make of a given vehicle.
     * @return 
     */
    String getMake(){
        return make;
    }
    
    /**
     * Method to get the model of a given vehicle.
     * @return 
     */
    String getModel(){
        return model;
    }
    
    /**
     * Method to get the color of a given vehicle.
     * @return 
     */
    String getColor(){
        return color;
    }
    
    /**
     * Method to change the vehicle description of a given vehicle.
     * @param Make
     * @param Model
     * @param Color 
     */
    void changeCar(String Make, String Model, String Color){
        make = Make;
        model = Model;
        color = Color;
    }
}
