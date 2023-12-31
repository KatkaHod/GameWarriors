package TurnBasedFight;

public class Fight {

    public static void main(String[] args) {

        //Two instances of Cube
        Cube sixWalls = new Cube();
        Cube tenWalls = new Cube(10); //parameter 10 walls

        //Throw with the six walls cube
        System.out.println(sixWalls);
        for (int i = 0; i < 10; i++) {
            System.out.println(sixWalls.throwcube() + " ");
        }

        //Throw wit the Cube with ten walls
        System.out.println("\n\n" + tenWalls);
        for (int i = 0; i < 10; i++ ) {
            System.out.println(tenWalls.throwcube() + " ");

        }

    }
} //end of the class
