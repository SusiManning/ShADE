/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 * Class to hold user login and profile ids to be accessed from all 
 * panels of the GUI.
 * @author SusiManning
 */
public class Singleton {
    
     /**
     * Method that follows Singleton design
     * @param Singleton
     * @param profid
     * @param classid
     */

   private static Singleton singleton = new Singleton( );

   /* A private Constructor prevents any other
    * class from instantiating.
    */
   private Singleton() { }

   /* Static 'instance' method */
   public static Singleton getInstance( ) {
      return singleton;
   }

   /* Other methods protected by singleton-ness */
   protected static void demoMethod( ) {
      System.out.println("demoMethod for singleton");
   }
   /**
    * Profile and login id variables.
    */
   public int profid = -1;
   public int classid = -1;
}
