package TurnBasedFight;

public class FighterTest {
    public static void main(String[] args) {
        Cube cube = new Cube(10);
        Fighter fighter = new Fighter("Achilles", 100, 100, 0, cube);

    System.out.printf("Fighter: %s%n ", fighter); //test toString()
    System.out.printf("Alive : %s%n ", fighter.isAlive()); //test isAlive()
    System.out.printf("Life: %s%n ", fighter.GraphicLife()); //test Graphic.Life()


    }
}
