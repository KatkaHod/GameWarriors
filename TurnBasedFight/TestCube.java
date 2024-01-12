package TurnBasedFight;

public class TestCube {

    public static void main(String[] args) {

        //First instance of Cube with no parameter
        Cube sixWalls = new Cube();

        //Throw with the six walls cube
        System.out.println(sixWalls);
        for (int i = 0; i < 10; i++) {
            System.out.print(sixWalls.throwcube() + " ");
        }
        //Second instance of Cube
        Cube tenWalls = new Cube(10);

        //Throw with the Cube with ten walls
        System.out.println("\n\n" + tenWalls);
        for (int i = 0; i < 10; i++ ) {
            System.out.print(tenWalls.throwcube() + " ");
        }




    }

}
