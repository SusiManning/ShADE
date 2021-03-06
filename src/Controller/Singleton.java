/*
 * Program Name: Singleton
 * Programmers: Susi Manning
 * Date Last Edited: 11/28/2017
 * Description: Class to hold user login and profile ids to be accessed from all
 * panels of the GUI.
 */
package Controller;

public class Singleton {
    

   private static Singleton singleton = new Singleton( );

   /* A private Constructor prevents any other
    * class from instantiating.
    */
 
   private Singleton() { }

   /* Static 'instance' method */
   /**
    * Method to return singleton instances
    * @return 
    */
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
