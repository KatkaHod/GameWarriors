package TurnBasedFight;

public class Fighter {

    /**
     * Name of fighter
     */
        private String name;

    /**
     *Number of hit points (hp)
     */
    private int life;

    /**
     * Max of life
     */
        private int maxLife;

    /**
     * Attack in hit points (hp)
     */
    private int attack;

    /**
     * Defence in hit points (hp)
     */
    private int defence;

    /**
     * Instance of Cube
     */
    private Cube cube;

    /**
     * Message to inform what is happening
     */
    private String messsage;

    /**
     * New constructor of Fighter Class
     * constructor for attributes name,life,attack,defence and cube
     */

    public Fighter(String name, int life, int maxLife, int attack, int defence, Cube cube) {
    this.name = name;
    this.life = life;
    this.maxLife = maxLife;
    this.attack = attack;
    this.defence = defence;
    this.cube = cube;
    }

    /**
     * Return name of the fighter
     */

    @Override
    public String toString() {
        return name;
    }

    /**
     * Fighter is live if he has more hp than 0
     */

    public boolean fighterAlive() {
        return (life > 0);
    }

    //continue with graphic life





}
