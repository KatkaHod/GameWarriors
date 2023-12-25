package TurnBasedFight;

public class Fight {

    public static void main(String[] args) {

        Cube sixWalls = new Cube(); //no parameter
        System.out.println(sixWalls.ReturnCountOfWalls());


        //call the first and second constructor
        Cube tenWalls = new Cube(10); //call the constructor with parameters
        System.out.println(tenWalls.ReturnCountOfWalls());



    }
}
