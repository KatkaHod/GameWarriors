package TurnBasedFight;
import java.util.Random;

/**
 * the class represents the playing cube
 * The class has two attributes, private modifier - visible in class only
 * Always set private modifier, except when I need public (some cases)
 */

public class Cube {

   private int numberOfWalls;

   /**
   Data type is "Random" a new private atribut random
    * Represents random number generator
    */
   private Random random;


    /** Creation of new constructor
     * No return type!
     * Declare same way as method
     * Name must be same as a name of Class!
     */
   public Cube() {
       numberOfWalls = 6; //Setting up the six walls
       random = new Random(); //instance of Random class

   }

} //End of the public class Cube
