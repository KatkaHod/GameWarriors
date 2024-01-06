package TurnBasedFight;
import java.util.Scanner;
import java.util.Random;

/**
 * the class represents the playing cube
 * The class has two attributes, private modifier - visible in class only
 * Always set private modifier, except when I need public (some cases)
 * Constructor- the method that is called when the object instance is created.
 * Constructors allow to initialise an object and set its properties at the time of creation.
 * *
 * Adding constructor to class - public Cube
 *      * No return type!
 *      * Declare same way as method
 *      * Name must be same as a name of Class!
 *      Important info - If no constructor is created in the class
 *                 a default constructor is created by default.
 */

public class Cube {

   private static int CountOfWalls; //New variable represents Count of walls in cube, cannot be modified externally
   private Random random; //New variable represents random number generator

    /**
     * Instance of Cube, no parameter
     * Object initialization
     */
    public Cube() {
        this.CountOfWalls = 6;
        random = new Random();
    }

    /**
     * Constructor with parameter
     * Object initialization based on  parameter
     * Using "this" to refer to the instance variable
     * @param CountOfWalls
     */
   public Cube(int CountOfWalls) {
       this.CountOfWalls = CountOfWalls; //Setting up the walls
       random = new Random(); //instance of Random class
   }

    /** READ-ONLY
     * User can see just the value (number) inside
     * @return number of Walls (There are 6 walls)
     */
    public static int ReturnCountOfWalls() {
        return CountOfWalls;
    }


    /**
     * Throw the cube
     * nextInt(till count of walls variable)
     * @return random number between 1-6
     */

    public int throwcube() {
        return random.nextInt(CountOfWalls) + 1;
    }

    /**
     * Returns the String representation of the object
     * Override annotation the compiler checks to ensure that I am truly overriding a method.
     * Helps to avoid accidental mistakes
     */
    @Override
    public String toString() {
        return String.format("Cube with %s walls", CountOfWalls);
    }

} //End of the public class Cube