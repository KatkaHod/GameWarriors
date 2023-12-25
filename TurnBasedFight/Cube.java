package TurnBasedFight;
import java.util.Scanner;
import java.util.Random;

/**
 * the class represents the playing cube
 * The class has two attributes, private modifier - visible in class only
 * Always set private modifier, except when I need public (some cases)
 * Constructor- the method that is called when the object instance is created.
 * *
 * Adding constructor to class - public Cube
 *      * No return type!
 *      * Declare same way as method
 *      * Name must be same as a name of Class!
 */

public class Cube {

   private static int CountOfWalls; //New variable represents Count of walls in cube, cannot be modified externally
   private Random random; //New variable represents random number generator

    //First method-constructor
    public Cube() {
        CountOfWalls = 6;
        random = new Random();
    }

    //Second method-constructor
    //When I do second a method with SAME variable I use "this." variable
    //Reference to the instance when setting the attribute (this.)
   public Cube(int CountOfWalls) {
       this.CountOfWalls = CountOfWalls; //Setting up the walls
       random = new Random(); //instance of Random class
   }

     //Return count of walls, READ-ONLY, User can see only the value inside, can not change!
    public static int ReturnCountOfWalls() {
        return CountOfWalls;
    }


} //End of the public class Cube
